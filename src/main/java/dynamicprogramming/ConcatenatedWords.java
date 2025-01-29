package dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Hard
 * <p>
 * Given an array of strings words (without duplicates), return all the concatenated words in the given list of words.
 * <p>
 * A concatenated word is defined as a string that is comprised entirely of at least two shorter words in the given array.
 * <p>
 * Example 1:
 * <p>
 * Input: words = ["cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"]
 * <p>
 * Output: ["catsdogcats","dogcatsdog","ratcatdogcat"]
 * <p>
 * Explanation: "catsdogcats" can be concatenated by "cats", "dog" and "cats"; "dogcatsdog" can be concatenated by "dog", "cats" and "dog"; "ratcatdogcat" can be concatenated by "rat", "cat", "dog" and "cat".
 * <p>
 * Example 2:
 * <p>
 * Input: words = ["cat","dog","catdog"]
 * <p>
 * Output: ["catdog"]
 * <p>
 * Constraints:
 * <p>
 * 1 <= words.length <= 10^4
 * 0 <= words[i].length <= 1000
 * words[i] consists of only lowercase English letters.
 * 0 <= sum(words[i].length) <= 10^5
 */
public class ConcatenatedWords {

    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        Set<String> dictionary = new HashSet<>(Arrays.asList(words));
        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (!word.isEmpty() && canForm(word, dictionary)) {
                result.add(word);
            }
        }
        return result;
    }

    private boolean canForm(String word, Set<String> dictionary) {
        dictionary.remove(word);
        int n = word.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && dictionary.contains(word.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        dictionary.add(word);
        return dp[n];
    }
}
