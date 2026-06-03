import java.util.*;

class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration,
                                  int[] waterStartTime, int[] waterDuration) {

        long ans = Long.MAX_VALUE;

        // Land -> Water
        RideQuery waterQuery = new RideQuery(waterStartTime, waterDuration);

        for (int i = 0; i < landStartTime.length; i++) {
            long landFinish = (long) landStartTime[i] + landDuration[i];
            ans = Math.min(ans, waterQuery.query(landFinish));
        }

        // Water -> Land
        RideQuery landQuery = new RideQuery(landStartTime, landDuration);

        for (int i = 0; i < waterStartTime.length; i++) {
            long waterFinish = (long) waterStartTime[i] + waterDuration[i];
            ans = Math.min(ans, landQuery.query(waterFinish));
        }

        return (int) ans;
    }

    static class RideQuery {
        int n;
        int[] start;
        long[] prefMinDuration;
        long[] suffMinFinish;

        RideQuery(int[] startTime, int[] duration) {
            n = startTime.length;

            int[][] rides = new int[n][2];
            for (int i = 0; i < n; i++) {
                rides[i][0] = startTime[i];
                rides[i][1] = duration[i];
            }

            Arrays.sort(rides, Comparator.comparingInt(a -> a[0]));

            start = new int[n];
            prefMinDuration = new long[n];
            suffMinFinish = new long[n];

            for (int i = 0; i < n; i++) {
                start[i] = rides[i][0];
            }

            prefMinDuration[0] = rides[0][1];
            for (int i = 1; i < n; i++) {
                prefMinDuration[i] =
                        Math.min(prefMinDuration[i - 1], rides[i][1]);
            }

            suffMinFinish[n - 1] =
                    (long) rides[n - 1][0] + rides[n - 1][1];

            for (int i = n - 2; i >= 0; i--) {
                suffMinFinish[i] = Math.min(
                        suffMinFinish[i + 1],
                        (long) rides[i][0] + rides[i][1]
                );
            }
        }

        long query(long x) {
            int idx = upperBound(start, x) - 1;

            long res = Long.MAX_VALUE;

            // rides already open when we finish first ride
            if (idx >= 0) {
                res = Math.min(res, x + prefMinDuration[idx]);
            }

            // rides that open later
            if (idx + 1 < n) {
                res = Math.min(res, suffMinFinish[idx + 1]);
            }

            return res;
        }

        private int upperBound(int[] arr, long target) {
            int l = 0, r = arr.length;
            while (l < r) {
                int mid = l + (r - l) / 2;
                if (arr[mid] <= target) {
                    l = mid + 1;
                } else {
                    r = mid;
                }
            }
            return l;
        }
    }
}