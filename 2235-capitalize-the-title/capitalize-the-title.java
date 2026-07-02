class Solution {
    public String capitalizeTitle(String title) {
        String[] word = title.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word.length; i++) {
            if (word[i].length() <= 2) {
                sb.append(word[i].toLowerCase());
            } else {
                sb.append(
                    Character.toUpperCase(word[i].charAt(0)) +
                    word[i].substring(1).toLowerCase()
                );
            }

            if (i != word.length - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}