import java.util.*;

class Solution {
    public String findDifferentBinaryString(String[] nums) {

        int n = nums.length;
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            char[] s = nums[i].toCharArray();
            int base = 1;
            int num = 0;

            for(int j=s.length-1;j>=0;j--)
            {
                int a = s[j] - '0';
                num = num + a * base;
                base = base * 2;
            }

            arr[i] = num;
        }

        Arrays.sort(arr);

        int ans = n;

        for(int i=0;i<n;i++)
        {
            if(i != arr[i])
            {
                ans = i;
                break;
            }
        }

        String binary = Integer.toBinaryString(ans);

        while(binary.length() < n)
        {
            binary = "0" + binary;
        }

        return binary;
    }
}