package popular;

import java.util.ArrayList;
import java.util.Collections;
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
 * Input: s = “leetcode”, wordDict = [“leet”,”code”]
 * <p>
 * Output: true
 * <p>
 * Explanation: Return true because “leetcode” can be segmented as “leet code”.
 * <p>
 * Example 2:
 * <p>
 * Input: s = “applepenapple”, wordDict = [“apple”,”pen”]
 * <p>
 * Output: true
 * <p>
 * Explanation: Return true because “applepenapple” can be segmented as “apple pen apple”. Note that you are allowed to reuse a dictionary word.
 * <p>
 * Example 3:
 * <p>
 * Input: s = “catsandog”, wordDict = [“cats”,”dog”,”sand”,”and”,”cat”]
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

    public static void main(String[] args) throws Exception {
        List<String> dic = new ArrayList<>();
        Collections.addAll(dic, "cats", "dog", "sand", "and", "cat");
        System.out.println(new WordBreak().wordBreak("catsandog", dic));
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> dictionary = new HashSet<>(wordDict);
        Map<Integer, Boolean> dic = new HashMap<>();
        for (int i = s.length() - 1; i >= 0; i--) dp(i, s, dic, dictionary);
        return dic.get(0);
    }

    private boolean dp(int i, String s, Map<Integer, Boolean> dic, Set<String> dictionary) {
        if (i == s.length()) return true;
        else if (dic.containsKey(i)) return dic.get(i);
        else {
            for (int j = i, l = s.length(); j < l; j++) {
                String subStr = s.substring(i, j + 1);
                if (dictionary.contains(subStr)) {
                    if (dp(j + 1, s, dic, dictionary)) {
                        dic.put(i, true);
                        break;
                    }
                }
            }
        }
        if (!dic.containsKey(i)) dic.put(i, false);
        return dic.get(i);
    }
}
