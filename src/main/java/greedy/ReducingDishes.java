package greedy;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Hard
 * <p>
 * A chef has collected data on the satisfaction level of his n dishes. Chef can cook any dish in 1 unit of time.
 * <p>
 * Like-time coefficient of a dish is defined as the time taken to cook that dish including previous dishes multiplied by its satisfaction level i.e. time[i] * satisfaction[i].
 * <p>
 * Return the maximum sum of like-time coefficient that the chef can obtain after dishes preparation.
 * <p>
 * Dishes can be prepared in any order and the chef can discard some dishes to get this maximum value.
 * <p>
 * Example 1:
 * <p>
 * Input: satisfaction = [-1,-8,0,5,-9]
 * <p>
 * Output: 14
 * <p>
 * Explanation: After Removing the second and last dish, the maximum total like-time coefficient will be equal to (-1*1 + 0*2 + 5*3 = 14). Each dish is prepared in one unit of time.
 * <p>
 * Example 2:
 * <p>
 * Input: satisfaction = [4,3,2]
 * <p>
 * Output: 20
 * <p>
 * Explanation: Dishes can be prepared in any order, (2*1 + 3*2 + 4*3 = 20)
 * <p>
 * Example 3:
 * <p>
 * Input: satisfaction = [-1,-4,-5]
 * <p>
 * Output: 0
 * <p>
 * Explanation: People do not like the dishes. No dish is prepared.
 * <p>
 * Constraints:
 * <p>
 * n == satisfaction.length
 * 1 <= n <= 500
 * -1000 <= satisfaction[i] <= 1000
 */
public class ReducingDishes {
    
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int ans = 0, s = 0;
        for (int i = satisfaction.length - 1; i >= 0; --i) {
            s += satisfaction[i];
            if (s <= 0) {
                break;
            }
            ans += s;
        }
        return ans;
    }
}
