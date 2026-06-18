class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of each card
        for (int num : deck) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int gcdValue = 0;

        // Find GCD of all frequencies
        for (int count : map.values()) {
            gcdValue = gcd(gcdValue, count);
        }

        return gcdValue > 1;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}