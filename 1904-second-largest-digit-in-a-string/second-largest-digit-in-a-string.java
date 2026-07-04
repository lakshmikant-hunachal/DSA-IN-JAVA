class Solution {
    public int secondHighest(String s) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                list.add(s.charAt(i)-'0');
            }
        }
        if(list.size()==0)
        {
            return -1;
        }
        int max=list.get(0);
        for(int i=1;i<list.size();i++)
        {
            if(max<list.get(i))
            {
                max=list.get(i);
            }
        }
        int ans=-1;
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)>ans && list.get(i)<max)
            {
                ans=list.get(i);
            }
        }
        return ans;
    }
}