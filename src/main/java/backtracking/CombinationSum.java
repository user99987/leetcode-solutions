package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Medium
 * <p>
 * Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.
 * <p>
 * The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.
 * <p>
 * It is guaranteed that the number of unique combinations that sum up to target is less than 150 combinations for the given input.
 * <p>
 * Example 1:
 * <p>
 * Input: candidates = [2,3,6,7], target = 7
 * <p>
 * Output: [[2,2,3],[7]]
 * <p>
 * Example 2:
 * <p>
 * Input: candidates = [2,3,5], target = 8
 * <p>
 * Output: [[2,2,2,2],[2,3,3],[3,5]]
 * <p>
 * Example 3:
 * <p>
 * Input: candidates = [2], target = 1
 * <p>
 * Output: []
 * <p>
 * Example 4:
 * <p>
 * Input: candidates = [1], target = 1
 * <p>
 * Output: [[1]]
 * <p>
 * Example 5:
 * <p>
 * Input: candidates = [1], target = 2
 * <p>
 * Output: [[1,1]]
 * <p>
 * Constraints:
 * <p>
 * 1 <= candidates.length <= 30
 * 1 <= candidates[i] <= 200
 * All elements of candidates are distinct.
 * 1 <= target <= 500
 */
public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int start, List<Integer> combination, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(combination));
            return;
        }
        for (int i = start; i < candidates.length && candidates[i] <= target; i++) {
            combination.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i, combination, result);
            combination.remove(combination.size() - 1);
        }
    }
}
