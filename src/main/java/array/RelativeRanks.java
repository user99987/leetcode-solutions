package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Easy
 * <p>
 * You are given an integer array score of size n, where score[i] is the score of the ith athlete in a competition. All the scores are guaranteed to be unique.
 * <p>
 * The athletes are placed based on their scores, where the 1st place athlete has the highest score, the 2nd place athlete has the 2nd highest score, and so on. The placement of each athlete determines their rank:
 * <p>
 * The 1st place athlete's rank is "Gold Medal".
 * The 2nd place athlete's rank is "Silver Medal".
 * The 3rd place athlete's rank is "Bronze Medal".
 * For the 4th place to the nth place athlete, their rank is their placement number (i.e., the xth place athlete's rank is "x").
 * Return an array answer of size n where answer[i] is the rank of the ith athlete.
 * <p>
 * Example 1:
 * <p>
 * Input: score = [5,4,3,2,1]
 * <p>
 * Output: ["Gold Medal","Silver Medal","Bronze Medal","4","5"]
 * <p>
 * Explanation: The placements are [1st, 2nd, 3rd, 4th, 5th].
 * <p>
 * Example 2:
 * <p>
 * Input: score = [10,3,8,9,4]
 * <p>
 * Output: ["Gold Medal","5","Bronze Medal","Silver Medal","4"]
 * <p>
 * Explanation: The placements are [1st, 5th, 3rd, 2nd, 4th].
 * <p>
 * Constraints:
 * <p>
 * n == score.length
 * 1 <= n <= 10^4
 * 0 <= score[i] <= 10^6
 * All the values in score are unique.
 */
public class RelativeRanks {

    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int[] sortedScore = score.clone();
        Arrays.sort(sortedScore);

        Map<Integer, String> rankMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int rank = n - i;
            if (rank == 1) {
                rankMap.put(sortedScore[i], "Gold Medal");
            } else if (rank == 2) {
                rankMap.put(sortedScore[i], "Silver Medal");
            } else if (rank == 3) {
                rankMap.put(sortedScore[i], "Bronze Medal");
            } else {
                rankMap.put(sortedScore[i], String.valueOf(rank));
            }
        }

        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = rankMap.get(score[i]);
        }
        return result;
    }
}
