package backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Medium
 * <p>
 * Given two integers n and k, return all possible combinations of k numbers out of the range [1, n].
 * <p>
 * You may return the answer in any order.
 * <p>
 * Example 1:
 * <p>
 * Input: n = 4, k = 2
 * <p>
 * Output: [ [2,4], [3,4], [2,3], [1,2], [1,3], [1,4], ]
 * <p>
 * Example 2:
 * <p>
 * Input: n = 1, k = 1
 * <p>
 * Output: [[1]]
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 20
 * 1 <= k <= n
 */
public class Combinations {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1, n, k, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, int n, int k, List<Integer> current, List<List<Integer>> result) {
        if (k == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i <= n; i++) {
            current.add(i);
            backtrack(i + 1, n, k - 1, current, result);
            current.remove(current.size() - 1);
        }
    }
}
