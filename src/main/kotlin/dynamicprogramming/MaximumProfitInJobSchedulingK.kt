package dynamicprogramming

/**
 * Hard
 *
 * We have n jobs, where every job is scheduled to be done from startTime[i] to endTime[i], obtaining a profit of profit[i].
 *
 * You're given the startTime, endTime and profit arrays, return the maximum profit you can take such that there are no two jobs in the subset with overlapping time range.
 *
 * If you choose a job that ends at time X you will be able to start another job that starts at time X.
 *
 * Example 1:
 *
 * Input: startTime = [1,2,3,3], endTime = [3,4,5,6], profit = [50,10,40,70]
 *
 * Output: 120
 *
 * Explanation: The subset chosen is the first and fourth job. Time range [1-3]+[3-6] , we get profit of 120 = 50 + 70.
 *
 * Example 2:
 *
 * Input: startTime = [1,2,3,4,6], endTime = [3,5,10,6,9], profit = [20,20,100,70,60]
 *
 * Output: 150
 *
 * Explanation: The subset chosen is the first, fourth and fifth job. Profit obtained 150 = 20 + 70 + 60.
 *
 * Example 3:
 *
 * Input: startTime = [1,1,1], endTime = [2,3,4], profit = [5,6,4]
 *
 * Output: 6
 *
 * Constraints:
 *
 * 1 <= startTime.length == endTime.length == profit.length <= 5 * 10^4
 * 1 <= startTime[i] < endTime[i] <= 10^9
 * 1 <= profit[i] <= 10^4
 */
class MaximumProfitInJobSchedulingK {

    fun jobScheduling(startTime: IntArray, endTime: IntArray, profit: IntArray): Int {
        val n = startTime.size
        var jobs = Array(n) { intArrayOf(startTime[it], endTime[it], profit[it]) }
        jobs = jobs.sortedBy { it[1] }.toTypedArray()

        val dp = IntArray(n)
        dp[0] = jobs[0][2]

        for (i in 1 until n) {
            var include = jobs[i][2]
            val l = binarySearch(jobs, i)
            if (l != -1) include += dp[l]
            dp[i] = maxOf(dp[i - 1], include)
        }
        return dp[n - 1]
    }

    private fun binarySearch(jobs: Array<IntArray>, index: Int): Int {
        var left = 0
        var right = index - 1
        while (left <= right) {
            val mid = (left + right) / 2
            if (jobs[mid][1] <= jobs[index][0]) {
                if (jobs[mid + 1][1] <= jobs[index][0]) left = mid + 1
                else return mid
            } else {
                right = mid - 1
            }
        }
        return -1
    }
}

