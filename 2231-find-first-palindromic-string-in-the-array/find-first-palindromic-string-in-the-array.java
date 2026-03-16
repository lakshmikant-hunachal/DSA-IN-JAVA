class Solution {
    public String firstPalindrome(String[] words) {

        for(int i = 0; i < words.length; i++) {

            String word = words[i];
            int n = word.length();
            boolean flag = true;

            for(int j = 0; j < n/2; j++) {
                if(word.charAt(j) != word.charAt(n - j - 1)) {
                    flag = false;
                    break;
                }
            }

            if(flag) {
                return word;
            }
        }

        return "";
    }
}