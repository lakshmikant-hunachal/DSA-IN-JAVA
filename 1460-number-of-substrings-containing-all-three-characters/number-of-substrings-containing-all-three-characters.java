/*class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            int a = 0, b = 0, c = 0;

            for (int j = i; j < s.length(); j++) {
                if (s.charAt(j) == 'a') a++;
                else if (s.charAt(j) == 'b') b++;
                else c++;

                if (a > 0 && b > 0 && c > 0) {
                    count++;
                }
            }
        }

        return count;
    }
}*/


class Solution {
    public int numberOfSubstrings(String s) {
        int[] freq = new int[3];
        int left = 0;
        int ans = 0;

        for (int right = 0; right < s.length(); right++) {
            freq[s.charAt(right) - 'a']++;

            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
                ans += s.length() - right;
                freq[s.charAt(left) - 'a']--;
                left++;
            }
        }

        return ans;
    }
}