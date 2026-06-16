class Solution {
    public String processStr(String s) {
        if (s.length() == 0) {
            return "";
        }

        String sb = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                if (sb.length() != 0) {
                    sb = sb.substring(0, sb.length() - 1);
                }
            }
            else if (s.charAt(i) == '#') {
                sb = sb + sb;
            }
            else if (s.charAt(i) == '%') {
                sb = new StringBuilder(sb).reverse().toString();
            }
            else {
                sb = sb + s.charAt(i);
            }
        }

        return sb;
    }
}