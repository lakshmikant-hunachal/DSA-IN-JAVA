class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        int[] c = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            setA.add(A[i]);
            setB.add(B[i]);

            int count = 0;
            for (int num : setA) {
                if (setB.contains(num)) {
                    count++;
                }
            }

            c[i] = count;
        }

        return c;
    }
}