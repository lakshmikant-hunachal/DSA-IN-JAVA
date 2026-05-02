class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> stack = new Stack<>();

        // Push digits while maintaining increasing order
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';

            while (!stack.isEmpty() && k > 0 && stack.peek() > digit) {
                stack.pop();
                k--;
            }

            stack.push(digit);
        }

        // If k is still left, remove from end
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        // Build number from stack
        StringBuilder sb = new StringBuilder();
        for (int digit : stack) {
            sb.append(digit);
        }

        // Remove leading zeros
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        // Return 0 if empty
        return sb.length() == 0 ? "0" : sb.toString();
    }
}