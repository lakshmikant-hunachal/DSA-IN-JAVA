class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequencies
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int sum = 0;

        // Add elements whose frequency is divisible by k
        for (int num : nums) {
            if (map.get(num) % k == 0) {
                sum += num;
            }
        }

        return sum;
    }
}