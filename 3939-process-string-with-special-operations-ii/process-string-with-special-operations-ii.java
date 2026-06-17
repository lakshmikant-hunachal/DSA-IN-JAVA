class Solution {
    public char processStr(String s, long k) {

        long len = 0;

        // Calculate final length
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '#') {
                len *= 2;
            }
            else if (ch == '*') {
                if (len > 0) len--;
            }
            else if (ch == '%') {
                // length unchanged
            }
            else {
                len++;
            }
        }

        if (k < 0 || k >= len) {
            return '.';
        }

        // Traverse backwards
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            if (ch == '#') {
                len /= 2;
                if (k >= len) {
                    k -= len;
                }
            }
            else if (ch == '*') {
                len++;
            }
            else if (ch == '%') {
                k = len - 1 - k;
            }
            else {
                len--;
                if (k == len) {
                    return ch;
                }
            }
        }

        return '.';
    }
}