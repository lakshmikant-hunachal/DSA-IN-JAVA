class Solution {
    public int maxIceCream(int[] costs, int coins) {
        countsort(costs,costs.length);
        if(costs[0]>coins)
        {
            return 0;
        }
        int count=0;
        int sum=0;
        for(int i=0;i<costs.length;i++)
        {
            if(sum+costs[i]<=coins)
            {
                sum+=costs[i];
                count++;
            }
            else
            {
                break;
            }
        }
        return count;
    }
    private void  countsort(int[]  arr,int n)
    {
        int max=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        int count[] = new int[max+1];
        for(int i=0;i<n;i++)
        {
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++)
        {
            while(count[i]>0)
            {
                arr[j]=i;
                count[i]--;
                j++;

            }
        }

    }
}