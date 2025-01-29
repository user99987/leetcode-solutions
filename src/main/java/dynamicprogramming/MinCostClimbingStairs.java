package dynamicprogramming;

/**
 * Easy
 * <p>
 * You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.
 * <p>
 * You can either start from the step with index 0, or the step with index 1.
 * <p>
 * Return the minimum cost to reach the top of the floor.
 * <p>
 * Example 1:
 * <p>
 * Input: cost = [10,15,20]
 * <p>
 * Output: 15
 * <p>
 * Explanation: You will start at index 1. - Pay 15 and climb two steps to reach the top. The total cost is 15.
 * <p>
 * Example 2:
 * <p>
 * Input: cost = [1,100,1,1,1,100,1,1,100,1]
 * <p>
 * Output: 6
 * <p>
 * Explanation: You will start at index 0.
 * <p>
 * Pay 1 and climb two steps to reach index 2.
 * Pay 1 and climb two steps to reach index 4.
 * Pay 1 and climb two steps to reach index 6.
 * Pay 1 and climb one step to reach index 7.
 * Pay 1 and climb two steps to reach index 9.
 * Pay 1 and climb one step to reach the top. The total cost is 6.
 * Constraints:
 * <p>
 * 2 <= cost.length <= 1000
 * 0 <= cost[i] <= 999
 */
public class MinCostClimbingStairs {

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        for (int i = n - 3; i >= 0; i--) {
            cost[i] += Math.min(cost[i + 1], cost[i + 2]);
        }
        return Math.min(cost[0], cost[1]);
    }
}
