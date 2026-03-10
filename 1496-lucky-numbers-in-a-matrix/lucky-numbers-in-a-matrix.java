class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < matrix.length; i++) {

            int min = matrix[i][0];
            int col = 0;

            // find minimum in row
            for(int j = 1; j < matrix[i].length; j++) {
                if(matrix[i][j] < min) {
                    min = matrix[i][j];
                    col = j;
                }
            }

            // check if it is maximum in column
            boolean isLucky = true;
            for(int k = 0; k < matrix.length; k++) {
                if(matrix[k][col] > min) {
                    isLucky = false;
                    break;
                }
            }

            if(isLucky) {
                list.add(min);
            }
        }

        return list;
    }
}