class Solution {
    public int bitwiseComplement(int n) {

        if(n==0) return 1;

        StringBuilder sb = new StringBuilder();

        while(n > 0) {
            int digits = n & 1;
            int r = digits ^ 1;
            sb.append(r);
            n = n >> 1;
        }

        String s = sb.reverse().toString();

        int base = 1;
        int num = 0;

        for(int i = s.length() - 1; i >= 0; i--) {
            int d = s.charAt(i) - '0';
            num = num + d * base;
            base = base * 2;
        }

        return num;
    }
}