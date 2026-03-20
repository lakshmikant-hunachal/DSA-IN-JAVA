class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";

        String hexChars = "0123456789abcdef";
        StringBuilder result = new StringBuilder();

        while (num != 0) {
            int digit = num & 15; // last 4 bits
            result.append(hexChars.charAt(digit));
            num >>>= 4; // unsigned shift
        }

        return result.reverse().toString();
    }
}