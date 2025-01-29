package greedy;

import java.util.ArrayList;
import java.util.List;

/**
 * Medium
 * <p>
 * You are given a string s. We want to partition the string into as many parts as possible so that each letter appears in at most one part.
 * <p>
 * Return a list of integers representing the size of these parts.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "ababcbacadefegdehijhklij"
 * <p>
 * Output: [9,7,8]
 * <p>
 * Explanation:
 * <p>
 * The partition is "ababcbaca", "defegde", "hijhklij".
 * This is a partition so that each letter appears in at most one part.
 * A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits s into less parts.
 * Example 2:
 * <p>
 * Input: s = "eccbbbbdec"
 * <p>
 * Output: [10]
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 500
 * s consists of lowercase English letters.
 */
public class PartitionLabels {

    public List<Integer> partitionLabels(String s) {
        int[] lastPosition = new int[26];
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            lastPosition[s.charAt(i) - 'a'] = i;
        }

        int maxEnd = 0, prev = -1;
        for (int i = 0; i < s.length(); i++) {
            maxEnd = Math.max(maxEnd, lastPosition[s.charAt(i) - 'a']);
            if (i == maxEnd) {
                result.add(i - prev);
                prev = i;
            }
        }
        return result;
    }
}
