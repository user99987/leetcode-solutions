package dynamicprogramming;

/**
 * Medium
 * <p>
 * You have planned some train traveling one year in advance. The days of the year in which you will travel are given as an integer array days. Each day is an integer from 1 to 365.
 * <p>
 * Train tickets are sold in three different ways:
 * <p>
 * a 1-day pass is sold for costs[0] dollars,
 * a 7-day pass is sold for costs[1] dollars, and
 * a 30-day pass is sold for costs[2] dollars.
 * The passes allow that many days of consecutive travel.
 * <p>
 * For example, if we get a 7-day pass on day 2, then we can travel for 7 days: 2, 3, 4, 5, 6, 7, and 8.
 * Return the minimum number of dollars you need to travel every day in the given list of days.
 * <p>
 * Example 1:
 * <p>
 * Input: days = [1,4,6,7,8,20], costs = [2,7,15]
 * <p>
 * Output: 11
 * <p>
 * Explanation: For example, here is one way to buy passes that lets you travel your travel plan:
 * <p>
 * On day 1, you bought a 1-day pass for costs[0] = $2, which covered day 1.
 * <p>
 * On day 3, you bought a 7-day pass for costs[1] = $7, which covered days 3, 4, …, 9.
 * <p>
 * On day 20, you bought a 1-day pass for costs[0] = $2, which covered day 20.
 * <p>
 * In total, you spent $11 and covered all the days of your travel.
 * <p>
 * Example 2:
 * <p>
 * Input: days = [1,2,3,4,5,6,7,8,9,10,30,31], costs = [2,7,15]
 * <p>
 * Output: 17
 * <p>
 * Explanation: For example, here is one way to buy passes that lets you travel your travel plan:
 * <p>
 * On day 1, you bought a 30-day pass for costs[2] = $15 which covered days 1, 2, …, 30.
 * <p>
 * On day 31, you bought a 1-day pass for costs[0] = $2 which covered day 31.
 * <p>
 * In total, you spent $17 and covered all the days of your travel.
 * <p>
 * Constraints:
 * <p>
 * 1 <= days.length <= 365
 * 1 <= days[i] <= 365
 * days is in strictly increasing order.
 * costs.length == 3
 * 1 <= costs[i] <= 1000
 */
public class MinimumCostForTickets {


    public int mincostTickets(int[] days, int[] costs) {
        int lastDay = days[days.length - 1];
        int[] dp = new int[lastDay + 1];
        boolean[] travelDays = new boolean[lastDay + 1];

        for (int day : days) {
            travelDays[day] = true;
        }

        for (int i = 1; i <= lastDay; i++) {
            if (!travelDays[i]) {
                dp[i] = dp[i - 1];
            } else {
                dp[i] = Math.min(dp[i - 1] + costs[0], Math.min(dp[Math.max(0, i - 7)] + costs[1], dp[Math.max(0, i - 30)] + costs[2]));
            }
        }
        return dp[lastDay];
    }
}
