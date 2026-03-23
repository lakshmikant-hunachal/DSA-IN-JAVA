class Solution {
    public int countEven(int num) {
        int count=0;
        for(int i=2;i<=num;i++)
        {
            int n=0;
            int temp=i;
            while(temp>0)
            {
                n=n+temp%10;
                temp=temp/10;
            }
            if(n%2==0)
            {
                count++;
            }
        }
        return count;
    }
}