class Solution {
    public boolean divisorGame(int n) {
        if(n<0)
        {
            return false;
        }
        return n%2==0;
    }
}