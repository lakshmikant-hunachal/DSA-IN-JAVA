/*class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

        String[] word1 = s1.split(" ");
        String[] word2 = s2.split(" ");

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < word1.length; i++) {

            boolean flag = true;

            for (int j = 0; j < word2.length; j++) {
                if (word1[i].equals(word2[j])) {
                    flag = false;
                    break;
                }
            }

            if (flag) {

                int count = 0;

                for (int j = 0; j < word1.length; j++) {
                    if (word1[i].equals(word1[j])) {
                        count++;
                    }
                }

                if (count == 1) {
                    list.add(word1[i]);
                }
            }
        }

        for (int i = 0; i < word2.length; i++) {

            boolean flag = true;

            for (int j = 0; j < word1.length; j++) {
                if (word2[i].equals(word1[j])) {
                    flag = false;
                    break;
                }
            }

            if (flag) {

                int count = 0;

                for (int j = 0; j < word2.length; j++) {
                    if (word2[i].equals(word2[j])) {
                        count++;
                    }
                }

                if (count == 1) {
                    list.add(word2[i]);
                }
            }
        }

        return list.toArray(new String[0]);
    }
}*/
//better approach
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

        String[] word1 = s1.split(" ");
        String[] word2 = s2.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < word1.length; i++) {
            map.put(word1[i], map.getOrDefault(word1[i], 0) + 1);
        }

        for (int i = 0; i < word2.length; i++) {
            map.put(word2[i], map.getOrDefault(word2[i], 0) + 1);
        }

        ArrayList<String> list = new ArrayList<>();

        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                list.add(key);
            }
        }

        return list.toArray(new String[0]);
    }
}