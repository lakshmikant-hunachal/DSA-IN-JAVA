class Solution {
    List<List<Integer>> list =new ArrayList<>();
    public List<List<Integer>> generate(int numRows) {
        for(int i=0;i<numRows;i++)
        {
            List<Integer> temp = new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                {
                    temp.add(1);
                }
                else
                {
                    List<Integer> t =list.get(i-1);
                        int sum=t.get(j-1)+t.get(j);
                        temp.add(sum);
                }
            }
            list.add(temp);
        }
        return list;
    }
}