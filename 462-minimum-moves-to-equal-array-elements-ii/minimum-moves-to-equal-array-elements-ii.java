class Solution {
    public int minMoves2(int[] nums) {

        sort(nums, 0, nums.length - 1);

        int median = nums[nums.length / 2];
        int moves = 0;

        for (int num : nums) {
            moves += Math.abs(num - median);
        }

        return moves;
    }

    private void sort(int[] a, int low, int high) {
        if (low >= high) {
            return;
        }

        int mid = low + (high - low) / 2;

        sort(a, low, mid);
        sort(a, mid + 1, high);

        merge(a, low, mid, high);
    }

    private void merge(int[] a, int low, int mid, int high) {

        int[] temp = new int[high - low + 1];

        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= high) {
            if (a[i] <= a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = a[i++];
        }

        while (j <= high) {
            temp[k++] = a[j++];
        }

        for (int p = 0; p < temp.length; p++) {
            a[low + p] = temp[p];
        }
    }
}