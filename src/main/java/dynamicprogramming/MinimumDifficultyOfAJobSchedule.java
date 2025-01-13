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

    public static void main(String[] args) {
        int[] A = {11, 111, 22, 222, 33, 333, 44, 444};
        System.out.println(new MinimumDifficultyOfAJobSchedule().minDifficulty(A, 6));
    }

    public int minDifficulty(int[] jobDifficulty, int d) {
        int totalJobs = jobDifficulty.length;
        if (totalJobs < d) {
            return -1;
        }
        int maxJobsOneDay = totalJobs - d + 1;
        int[] map = new int[totalJobs];
        int maxDiff = Integer.MIN_VALUE;
        for (int k = totalJobs - 1; k > totalJobs - 1 - maxJobsOneDay; k--) {
            maxDiff = Math.max(maxDiff, jobDifficulty[k]);
            map[k] = maxDiff;
        }
        for (int day = d - 1; day > 0; day--) {
            int maxEndIndex = (totalJobs - 1) - (d - day);
            int maxStartIndex = maxEndIndex - maxJobsOneDay + 1;
            for (int startIndex = maxStartIndex; startIndex <= maxEndIndex; startIndex++) {
                map[startIndex] = Integer.MAX_VALUE;
                int maxDiffOfTheDay = Integer.MIN_VALUE;
                for (int endIndex = startIndex; endIndex <= maxEndIndex; endIndex++) {
                    maxDiffOfTheDay = Math.max(maxDiffOfTheDay, jobDifficulty[endIndex]);
                    int totalDiff = maxDiffOfTheDay + map[endIndex + 1];
                    map[startIndex] = Math.min(map[startIndex], totalDiff);
                }
            }
        }
        return map[0];
    }
}
