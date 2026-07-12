package popular;

import java.util.ArrayList;
import java.util.List;

/**
 * Medium
 * <p>
 * Given a string s, partition s such that every substring of the partition is a palindrome. Return all possible palindrome partitioning of s.
 * <p>
 * A palindrome string is a string that reads the same backward as forward.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "aab"
 * <p>
 * Output: [["a","a","b"],["aa","b"]]
 * <p>
 * Example 2:
 * <p>
 * Input: s = "a"
 * <p>
 * Output: [["a"]]
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 16
 * s contains only lowercase English letters.
 */
public class PalindromePartitioning {

    public List<List<String>> partition(String s) {
        var result = new ArrayList<List<String>>();
        backtrack(s, 0, new ArrayList<>(), buildPalindromeTable(s), result);
        return result;
    }

    private void backtrack(String s, int start, List<String> partition, boolean[][] palindrome, List<List<String>> result) {
        if (start == s.length()) {
            result.add(new ArrayList<>(partition));
            return;
        }

        for (int end = start; end < s.length(); end++) {
            if (!palindrome[start][end]) {
                continue;
            }
            partition.add(s.substring(start, end + 1));
            backtrack(s, end + 1, partition, palindrome, result);
            partition.remove(partition.size() - 1);
        }
    }

    private boolean[][] buildPalindromeTable(String s) {
        boolean[][] palindrome = new boolean[s.length()][s.length()];
        for (int start = s.length() - 1; start >= 0; start--) {
            for (int end = start; end < s.length(); end++) {
                palindrome[start][end] = s.charAt(start) == s.charAt(end)
                        && (end - start < 2 || palindrome[start + 1][end - 1]);
            }
        }
        return palindrome;
    }
}
