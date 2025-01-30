package popular;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Medium
 * <p>
 * Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.
 * <p>
 * Note that the same word in the dictionary may be reused multiple times in the segmentation.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "leetcode", wordDict = ["leet","code"]
 * <p>
 * Output: true
 * <p>
 * Explanation: Return true because "leetcode" can be segmented as "leet code".
 * <p>
 * Example 2:
 * <p>
 * Input: s = "applepenapple", wordDict = ["apple","pen"]
 * <p>
 * Output: true
 * <p>
 * Explanation: Return true because "applepenapple" can be segmented as "apple pen apple". Note that you are allowed to reuse a dictionary word.
 * <p>
 * Example 3:
 * <p>
 * Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
 * <p>
 * Output: false
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 300
 * 1 <= wordDict.length <= 1000
 * 1 <= wordDict[i].length <= 20
 * s and wordDict[i] consist of only lowercase English letters.
 * All the strings of wordDict are unique.
 */
public class WordBreak {

    public boolean wordBreak(String input, List<String> wordDict) {
        Set<String> dictionary = new HashSet<>(wordDict);
        Map<Integer, Boolean> memo = new HashMap<>();
        return canSegment(0, input, memo, dictionary);
    }

    private boolean canSegment(int index, String input, Map<Integer, Boolean> memo, Set<String> dictionary) {
        if (index == input.length()) return true;
        if (memo.containsKey(index)) return memo.get(index);

        boolean canBreak = dictionary.stream()
                .filter(word -> input.startsWith(word, index))
                .anyMatch(word -> canSegment(index + word.length(), input, memo, dictionary));

        memo.put(index, canBreak);
        return canBreak;
    }
}
