class Solution {

    int count = 0;
    String result = "";

    public String getHappyString(int n, int k) {
        dfs("", n, k);
        return result;
    }

    private void dfs(String current, int n, int k) {

        if (current.length() == n) {
            count++;

            if (count == k) {
                result = current;
            }
            return;
        }

        for (char ch : new char[]{'a','b','c'}) {

            if (current.length() > 0 && current.charAt(current.length()-1) == ch) {
                continue;
            }

            dfs(current + ch, n, k);

            if (!result.equals("")) {
                return;
            }
        }
    }
}