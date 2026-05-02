class Solution {
    public int tribonacci(int n) {
        // Base cases
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;

        int[] arr = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            arr[i] = -1;
        }

        return find(n, arr);
    }

    private int find(int n, int[] arr) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;

        if (arr[n] != -1) {
            return arr[n];
        }

        arr[n] = find(n - 1, arr) + find(n - 2, arr) + find(n - 3, arr);

        return arr[n];
    }
}