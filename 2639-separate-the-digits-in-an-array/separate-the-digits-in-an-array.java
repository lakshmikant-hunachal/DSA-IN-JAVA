class Solution {
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<Integer> l = new ArrayList<>();
    public int[] separateDigits(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            int temp=nums[i];
            while(temp>0)
            {
                int ele=temp%10;
                l.add(ele);
                temp=temp/10;
            }
            for(int j=l.size()-1;j>=0;j--)
            {
                list.add(l.remove(j));
            }
        }
        int[] ans = new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            ans[i]=list.get(i);
        }
        return ans;
    }
}