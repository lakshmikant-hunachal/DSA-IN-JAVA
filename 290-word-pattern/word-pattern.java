import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] st = s.split(" ");

        if (pattern.length() != st.length) {
            return false;
        }

        HashMap<Character, String> mapSW = new HashMap<>();
        HashMap<String, Character> mapWS = new HashMap<>();

        for (int i = 0; i < st.length; i++) {

            char ch1 = pattern.charAt(i);

            // character -> word
            if (mapSW.containsKey(ch1)) {
                if (!mapSW.get(ch1).equals(st[i])) {
                    return false;
                }
            } else {
                mapSW.put(ch1, st[i]);
            }

            // word -> character
            if (mapWS.containsKey(st[i])) {
                if (mapWS.get(st[i]) != ch1) {
                    return false;
                }
            } else {
                mapWS.put(st[i], ch1);
            }
        }

        return true;
    }
}