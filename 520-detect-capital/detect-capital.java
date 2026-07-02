class Solution {
    public boolean detectCapitalUse(String word) {
        String temp1 = word.toUpperCase();
        String temp2 = Character.toUpperCase(word.charAt(0))+word.substring(1).toLowerCase();
        String temp3 = word.toLowerCase();
        if((word.equals(temp1)) || (word.equals(temp2))|| (word.equals(temp3)))
        {
            return true;
        }
        return false;
    }
}