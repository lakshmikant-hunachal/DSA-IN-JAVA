/*class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean ala[] = new boolean[26];
        int count=0;
        for(char c:allowed.toCharArray())
        {
            ala[c-'a']=true;
        }
        for(String s:words)
        {
            int con=1;
            for(char c: s.toCharArray())
            {
                if(!ala[c-'a'])
                {
                    con=0;
                    break;
                }
            }
            if(con==1)
            {
                count++;
            }
        }
        return count;
    }
}*/
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : allowed.toCharArray())
        {
            map.put(c,1);
        }
        int count=0;
        for(String word : words)
        {
            boolean correct=true;
            for(char c : word.toCharArray())
            {
                if(!map.containsKey(c))
                {
                    correct=false;
                    break;
                }
            }
            if(correct)
            {
                count++;
            }
        }
        return count;
    }
}