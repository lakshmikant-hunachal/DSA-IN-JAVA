class Solution {
    public int[] shortestToChar(String s, char c) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c)
            {
                list.add(i);
            }
        }
        int ans[] = new int[s.length()];
        for(int i=0;i<ans.length;i++ )
        {
            int min=Math.abs(i-list.get(0));
            for(int j=1;j<list.size();j++)
            {
                if(min>Math.abs(i-list.get(j)))
                {
                    min=Math.abs(i-list.get(j));
                }
            }
            ans[i]=min;
        }
        return ans;

    }
}