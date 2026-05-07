class Solution {
    List<List<Integer>> list = new ArrayList<>();

    public List<Integer> getRow(int rowIndex) {

        for (int i = 0; i <= rowIndex; i++) {

            List<Integer> temp = new ArrayList<>();

            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {
                    temp.add(1);
                } 
                else {
                    List<Integer> prev = list.get(i - 1);

                    int sum = prev.get(j - 1) + prev.get(j);

                    temp.add(sum);
                }
            }

            list.add(temp);
        }

        return list.get(rowIndex);
    }
}