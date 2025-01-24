package greedy;
/**
 * Hard
 * <p>
 * Suppose LeetCode will start its IPO soon. In order to sell a good price of its shares to Venture Capital, LeetCode would like to work on some projects to increase its capital before the IPO. Since it has limited resources, it can only finish at most k distinct projects before the IPO. Help LeetCode design the best way to maximize its total capital after finishing at most k distinct projects.
 * <p>
 * You are given n projects where the ith project has a pure profit profits[i] and a minimum capital of capital[i] is needed to start it.
 * <p>
 * Initially, you have w capital. When you finish a project, you will obtain its pure profit and the profit will be added to your total capital.
 * <p>
 * Pick a list of at most k distinct projects from given projects to maximize your final capital, and return the final maximized capital.
 * <p>
 * The answer is guaranteed to fit in a 32-bit signed integer.
 * <p>
 * Example 1:
 * <p>
 * Input: k = 2, w = 0, profits = [1,2,3], capital = [0,1,1]
 * <p>
 * Output: 4
 * <p>
 * Explanation:
 * <p>
 * Since your initial capital is 0, you can only start the project indexed 0.
 * <p>
 * After finishing it you will obtain profit 1 and your capital becomes 1.
 * <p>
 * With capital 1, you can either start the project indexed 1 or the project indexed 2.
 * <p>
 * Since you can choose at most 2 projects, you need to finish the project indexed 2 to get the maximum capital.
 * <p>
 * Therefore, output the final maximized capital, which is 0 + 1 + 3 = 4.
 * <p>
 * Example 2:
 * <p>
 * Input: k = 3, w = 0, profits = [1,2,3], capital = [0,1,2]
 * <p>
 * Output: 6
 * <p>
 * Constraints:
 * <p>
 * 1 <= k <= 10^5
 * 0 <= w <= 10^9
 * n == profits.length
 * n == capital.length
 * 1 <= n <= 10^5
 * 0 <= profits[i] <= 10^4
 * 0 <= capital[i] <= 10^9
 */

import java.util.Comparator;
import java.util.PriorityQueue;

public class IPO {

    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        PriorityQueue<int[]> minCapital =
                new PriorityQueue<>(Comparator.comparingInt((int[] a) -> a[1]));
        PriorityQueue<int[]> maxProfit = new PriorityQueue<>((int[] a, int[] b) -> b[0] - a[0]);
        for (int i = 0; i < profits.length; i++) {
            if (w >= capital[i]) {
                maxProfit.offer(new int[]{profits[i], capital[i]});
            } else {
                minCapital.offer(new int[]{profits[i], capital[i]});
            }
        }
        int count = 0;
        while (count < k && !maxProfit.isEmpty()) {
            int[] temp = maxProfit.poll();
            w += temp[0];
            count += 1;
            while (!minCapital.isEmpty() && minCapital.peek()[1] <= w) {
                maxProfit.offer(minCapital.poll());
            }
        }
        return w;
    }
}
