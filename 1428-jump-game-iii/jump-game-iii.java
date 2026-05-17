class Solution {
    public boolean canReach(int[] arr, int start) {
        boolean[] visited = new boolean[arr.length];
        return dfs(arr, start, visited);
    }

    public boolean dfs(int[] arr, int index, boolean[] visited) {
        // Out of bounds or already visited
        if (index < 0 || index >= arr.length || visited[index]) {
            return false;
        }

        // Reached a zero
        if (arr[index] == 0) {
            return true;
        }

        // Mark as visited
        visited[index] = true;

        // Try both directions
        return dfs(arr, index + arr[index], visited) ||
               dfs(arr, index - arr[index], visited);
    }
}