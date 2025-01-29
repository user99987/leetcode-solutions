package dynamicprogramming;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Hard
 * <p>
 * We have n jobs, where every job is scheduled to be done from startTime[i] to endTime[i], obtaining a profit of profit[i].
 * <p>
 * You're given the startTime, endTime and profit arrays, return the maximum profit you can take such that there are no two jobs in the subset with overlapping time range.
 * <p>
 * If you choose a job that ends at time X you will be able to start another job that starts at time X.
 * <p>
 * Example 1:
 * <p>
 * Input: startTime = [1,2,3,3], endTime = [3,4,5,6], profit = [50,10,40,70]
 * <p>
 * Output: 120
 * <p>
 * Explanation: The subset chosen is the first and fourth job. Time range [1-3]+[3-6] , we get profit of 120 = 50 + 70.
 * <p>
 * Example 2:
 * <p>
 * Input: startTime = [1,2,3,4,6], endTime = [3,5,10,6,9], profit = [20,20,100,70,60]
 * <p>
 * Output: 150
 * <p>
 * Explanation: The subset chosen is the first, fourth and fifth job. Profit obtained 150 = 20 + 70 + 60.
 * <p>
 * Example 3:
 * <p>
 * Input: startTime = [1,1,1], endTime = [2,3,4], profit = [5,6,4]
 * <p>
 * Output: 6
 * <p>
 * Constraints:
 * <p>
 * 1 <= startTime.length == endTime.length == profit.length <= 5 * 10^4
 * 1 <= startTime[i] < endTime[i] <= 10^9
 * 1 <= profit[i] <= 10^4
 */
public class MaximumProfitInJobScheduling {

    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        int[][] jobs = new int[n][3];

        for (int i = 0; i < n; i++) {
            jobs[i] = new int[]{startTime[i], endTime[i], profit[i]};
        }
        Arrays.sort(jobs, Comparator.comparingInt(a -> a[1]));

        int[] dp = new int[n];
        dp[0] = jobs[0][2];

        for (int i = 1; i < n; i++) {
            int include = jobs[i][2];
            int l = binarySearch(jobs, i);
            if (l != -1) include += dp[l];
            dp[i] = Math.max(dp[i - 1], include);
        }
        return dp[n - 1];
    }

    private int binarySearch(int[][] jobs, int index) {
        int left = 0, right = index - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (jobs[mid][1] <= jobs[index][0]) {
                if (jobs[mid + 1][1] <= jobs[index][0]) left = mid + 1;
                else return mid;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

}
