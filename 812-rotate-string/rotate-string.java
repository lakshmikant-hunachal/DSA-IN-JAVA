class Solution {
    public boolean rotateString(String s, String goal) {
        // Length must match
        if (s.length() != goal.length()) {
            return false;
        }

        // If goal is a rotation of s,
        // it must be a substring of s+s
        String doubled = s + s;

        return doubled.contains(goal);
    }
}