class Solution {
    public int findLucky(int[] arr) {
        int ans=-1;
        sort(arr);
        if(arr.length==0)
        {
            return ans;
        }
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
           for(int j=0;j<arr.length;j++)
           {
            if(arr[i]==arr[j])
            {
                count++;
            }
           }
           if(count==arr[i])
           {
            ans=count;
            break;
           }
        }
     return ans;
    }
    private void sort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j+1]>arr[j])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }   
         }
}