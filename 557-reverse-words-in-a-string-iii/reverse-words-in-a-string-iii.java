class Solution {
    public String reverseWords(String s) {
        StringBuilder word = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
           if(s.charAt(i)==' ')
           {
            sb.append(word.reverse());
            sb.append(" ");
            word.setLength(0);
           }
           else
           {
            word.append(s.charAt(i));
           }
        }
        sb.append(word.reverse());
        return sb.toString();
    }
}