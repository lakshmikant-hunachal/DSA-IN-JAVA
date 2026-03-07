class Solution {
    public int[] decode(int[] encoded, int first) {
        int n=encoded.length;
        int arr[]=new int[n+1];
        int j=0;
        int f=first;
        arr[j]=first;
        for(int i=0;i<n;i++)
        {
           int ele=f^encoded[i];
           j++;
           arr[j]=ele;
           f=ele;
        }
        return arr;
    }
}