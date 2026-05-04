class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] ans = new int[num_people];
        
        int give = 1;
        int i = 0;
        
        while(candies > 0) {
            ans[i] += Math.min(give, candies);
            candies -= give;
            give++;
            i = (i + 1) % num_people;
        }
        
        return ans;
    }
}