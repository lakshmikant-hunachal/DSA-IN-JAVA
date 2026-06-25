class Solution {
    public int countSegments(String s) {
        if (s.length() == 0) {
            return 0;
        }

        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                sb.append(s.charAt(i));
            } else {
                if (sb.length() != 0) {
                    list.add(sb.toString());
                    sb.setLength(0);
                }
            }
        }
        if (sb.length() != 0) {
            list.add(sb.toString());
        }

        return list.size();
    }
}