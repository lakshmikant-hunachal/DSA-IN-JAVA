class Solution {

    public long minCost(String s, int encCost, int flatCost) {

        int arr[] = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) - '0';
        }

        return split(arr, 0, arr.length - 1, encCost, flatCost);
    }

    private long split(int arr[], int s, int e, int encCost, int flatCost) {

        // Cost without splitting
        long currentCost = find(arr, s, e, encCost, flatCost);

        int len = e - s + 1;

        // Cannot split if length is odd or 1
        if (len % 2 == 1)
            return currentCost;

        int mid = s + (e - s) / 2;

        long left = split(arr, s, mid, encCost, flatCost);
        long right = split(arr, mid + 1, e, encCost, flatCost);

        return Math.min(currentCost, left + right);
    }

    private long find(int arr[], int s, int e, int encCost, int flatCost) {

        int count = 0;

        for (int i = s; i <= e; i++) {
            if (arr[i] == 1)
                count++;
        }

        int len = e - s + 1;

        if (count == 0)
            return flatCost;

        return 1L * len * count * encCost;
    }
}