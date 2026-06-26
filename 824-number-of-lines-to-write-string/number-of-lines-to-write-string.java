class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int sum=0;
        int line=1;
        int ans[] = new int[2];
        for(int i=0;i<s.length();i++)
        {
            int j=s.charAt(i)-'a';
            if(sum+widths[j]>100)
            {
                sum=widths[j];
                line++;
            }
            else
            {
                sum=sum+widths[j];
            }
        }
        ans[0]=line;
        ans[1]=sum;
        return ans;

    }
}