class Solution {
    public String reverseWords(String s) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ' && sb.length()!=0)
            {
                list.add(sb.toString());
                sb.setLength(0);
            }
            if(s.charAt(i)!=' ')
            {
                sb.append(s.charAt(i));
            }
        }
        if(sb.length()!=0)
        {
            list.add(sb.toString());
        }
        StringBuilder ans = new StringBuilder();
        for(int i=list.size()-1;i>=0;i--)
        {
            ans.append(list.get(i));
            if(i!=0)
            {
                ans.append(' ');
            }
        }
        return ans.toString();
    }
}