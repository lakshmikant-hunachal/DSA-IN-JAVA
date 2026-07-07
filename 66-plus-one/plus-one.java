class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> list = new ArrayList<>();
        int num=digits[digits.length-1]+1;
        list.add(num%10);
        int carry=num/10;
        for(int i = digits.length-2;i >= 0;i--)
        {
            int n = digits[i]+carry;
            list.add(n%10);
            carry=n/10;
        }
        if(carry!=0)
        {
            list.add(carry);
        }
        int n=list.size();
        int ans[] = new int[n];
        for(int i=0;i<n;i++)
        {
            ans[i]=list.get(n-1-i);
        }
        return ans;
    }
}