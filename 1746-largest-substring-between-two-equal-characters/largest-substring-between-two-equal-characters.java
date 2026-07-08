class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int n = s.length();
        int max = -1;

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    max = Math.max(max, j - i - 1);
                    break;
                }
            }
        }

        return max;
    }
}