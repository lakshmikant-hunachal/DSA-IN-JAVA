class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int m = box.length;
        int n = box[0].length;

        // Step 1: apply gravity (move stones to right)
        for (int i = 0; i < m; i++) {
            int empty = n - 1;

            for (int j = n - 1; j >= 0; j--) {
                if (box[i][j] == '*') {
                    empty = j - 1;
                } else if (box[i][j] == '#') {
                    char temp = box[i][empty];
                    box[i][empty] = '#';
                    if (empty != j) box[i][j] = '.';
                    empty--;
                }
            }
        }

        // Step 2: rotate 90° clockwise
        char[][] ans = new char[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[j][m - i - 1] = box[i][j];
            }
        }

        return ans;
    }
}