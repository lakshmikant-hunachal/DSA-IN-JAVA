class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {

                if (!stack.isEmpty()) {
                    sb.append(s.charAt(i));
                }

                stack.push(s.charAt(i));

            } else {

                if (stack.size() > 1) {
                    sb.append(s.charAt(i));
                }

                stack.pop();
            }
        }

        return sb.toString();
    }
}