class Solution {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch != ']') {
                stack.push(ch);
            } else {
                StringBuilder str = new StringBuilder();
                while (stack.peek() != '[') {
                    str.append(stack.pop());
                }
                stack.pop();

                str.reverse();
                int base = 1;
                int num = 0;
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    num = (stack.pop() - '0') * base + num;
                    base *= 10;
                }
                String repeat = str.toString();
                for (int i = 0; i < num; i++) {
                    for (char c : repeat.toCharArray()) {
                        stack.push(c);
                    }
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }

        return ans.reverse().toString();
    }
}