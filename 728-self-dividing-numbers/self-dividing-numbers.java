class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            int temp= i;
            boolean tag=true;
            while(temp>0)
            {
                int rem=temp%10;
                if(rem==0 || i%rem!=0)
                {
                    tag=false;
                    break;
                }
                temp=temp/10;
            }
            if(tag)
            {
                list.add(i);
            }
        }
        return list;
    }
}