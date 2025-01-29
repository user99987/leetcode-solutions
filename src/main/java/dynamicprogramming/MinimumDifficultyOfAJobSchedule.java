package dynamicprogramming;

/**
 * Hard
 * <p>
 * You want to schedule a list of jobs in d days. Jobs are dependent (i.e To work on the ith job, you have to finish all the jobs j where 0 <= j < i).
 * <p>
 * You have to finish at least one task every day. The difficulty of a job schedule is the sum of difficulties of each day of the d days. The difficulty of a day is the maximum difficulty of a job done on that day.
 * <p>
 * You are given an integer array jobDifficulty and an integer d. The difficulty of the ith job is jobDifficulty[i].
 * <p>
 * Return the minimum difficulty of a job schedule. If you cannot find a schedule for the jobs return -1.
 * <p>
 * Example 1:
 * <p>
 * <p>
 * <p>
 * Input: jobDifficulty = [6,5,4,3,2,1], d = 2
 * <p>
 * Output: 7
 * <p>
 * Explanation: First day you can finish the first 5 jobs, total difficulty = 6.
 * <p>
 * Second day you can finish the last job, total difficulty = 1.
 * <p>
 * The difficulty of the schedule = 6 + 1 = 7
 * <p>
 * Example 2:
 * <p>
 * Input: jobDifficulty = [9,9,9], d = 4
 * <p>
 * Output: -1
 * <p>
 * Explanation: If you finish a job per day you will still have a free day. you cannot find a schedule for the given jobs.
 * <p>
 * Example 3:
 * <p>
 * Input: jobDifficulty = [1,1,1], d = 3
 * <p>
 * Output: 3
 * <p>
 * Explanation: The schedule is one job per day. total difficulty will be 3.
 * <p>
 * Constraints:
 * <p>
 * 1 <= jobDifficulty.length <= 300
 * 0 <= jobDifficulty[i] <= 1000
 * 1 <= d <= 10
 */
public class MinimumDifficultyOfAJobSchedule {

    public int minDifficulty(int[] jobDifficulty, int d) {
        int n = jobDifficulty.length;
        if (n < d) return -1;

        int[][] dp = new int[d + 1][n + 1];
        for (int i = 0; i <= d; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = Integer.MAX_VALUE / 2;
            }
        }
        dp[0][0] = 0;

        for (int day = 1; day <= d; day++) {
            for (int end = day; end <= n; end++) {
                int maxJob = 0;
                for (int start = end - 1; start >= day - 1; start--) {
                    maxJob = Math.max(maxJob, jobDifficulty[start]);
                    dp[day][end] = Math.min(dp[day][end], dp[day - 1][start] + maxJob);
                }
            }
        }
        return dp[d][n];
    }
}
