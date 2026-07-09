class Solution {
    public int balancedStringSplit(String s) {
        int count=0;
        int R=0;
        int L=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='R')
            {
                R++;
            }
            else
            {
                L++;
            }
            if(R==L)
            {
                count++;
                L=0;
                R=0;
            }
        }
        return count;
    }
}