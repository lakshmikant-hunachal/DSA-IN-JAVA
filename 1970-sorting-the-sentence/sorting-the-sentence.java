class Solution {
    public String sortSentence(String s) {
        HashMap<Integer, String> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != ' ' && !Character.isDigit(s.charAt(i))) {
                sb.append(s.charAt(i));
            }

            if (Character.isDigit(s.charAt(i))) {
                int idx = s.charAt(i) - '0';
                map.put(idx, sb.toString());
                sb.setLength(0);
            }
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 1; i <= map.size(); i++) {
            ans.append(map.get(i));
            if (i != map.size()) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }
}