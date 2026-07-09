import java.util.*;
import java.util.regex.Pattern;

class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> list = new ArrayList<>();

        for (String word : words) {
            String[] parts = word.split(Pattern.quote(String.valueOf(separator)));

            for (String s : parts) {
                if (!s.isEmpty()) {
                    list.add(s);
                }
            }
        }

        return list;
    }
}