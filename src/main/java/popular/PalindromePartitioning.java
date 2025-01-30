package popular;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

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
        List<List<String>> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(String s, int start, List<String> partition, List<List<String>> result) {
        if (start == s.length()) {
            result.add(new ArrayList<>(partition));
            return;
        }

        IntStream.range(start, s.length())
                .mapToObj(i -> s.substring(start, i + 1))
                .filter(this::isPalindrome)
                .forEach(substring -> {
                    partition.add(substring);
                    backtrack(s, start + substring.length(), partition, result);
                    partition.remove(partition.size() - 1);
                });
    }

    private boolean isPalindrome(String s) {
        return IntStream.range(0, s.length() / 2)
                .allMatch(i -> s.charAt(i) == s.charAt(s.length() - i - 1));
    }
}
