package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Medium
 * <p>
 * Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.
 * <p>
 * Each number in candidates may only be used once in the combination.
 * <p>
 * Note: The solution set must not contain duplicate combinations.
 * <p>
 * Example 1:
 * <p>
 * Input: candidates = [10,1,2,7,6,1,5], target = 8
 * <p>
 * Output:
 * <p>
 * [
 * [1,1,6],
 * [1,2,5],
 * [1,7],
 * [2,6]
 * ]
 * Example 2:
 * <p>
 * Input: candidates = [2,5,2,1,2], target = 5
 * <p>
 * Output:
 * <p>
 * [
 * [1,2,2],
 * [5]
 * ]
 * Constraints:
 * <p>
 * 1 <= candidates.length <= 100
 * 1 <= candidates[i] <= 50
 * 1 <= target <= 30
 */
public class CombinationSumII {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, result, new LinkedList<>());
        return result;
    }

    private void backtrack(int[] candidates, int target, int start, List<List<Integer>> result, LinkedList<Integer> combination) {
        if (target == 0) {
            result.add(new ArrayList<>(combination));
            return;
        }
        for (int i = start; i < candidates.length && candidates[i] <= target; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) continue;
            combination.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i + 1, result, combination);
            combination.removeLast();
        }
    }
}
