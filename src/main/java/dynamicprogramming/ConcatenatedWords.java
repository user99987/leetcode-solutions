package dynamicprogramming;

import java.util.ArrayList;
import java.util.Collections;
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
 * Input: words = [“cat”,”cats”,”catsdogcats”,”dog”,”dogcatsdog”,”hippopotamuses”,”rat”,”ratcatdogcat”]
 * <p>
 * Output: [“catsdogcats”,”dogcatsdog”,”ratcatdogcat”]
 * <p>
 * Explanation: “catsdogcats” can be concatenated by “cats”, “dog” and “cats”; “dogcatsdog” can be concatenated by “dog”, “cats” and “dog”; “ratcatdogcat” can be concatenated by “rat”, “cat”, “dog” and “cat”.
 * <p>
 * Example 2:
 * <p>
 * Input: words = [“cat”,”dog”,”catdog”]
 * <p>
 * Output: [“catdog”]
 * <p>
 * Constraints:
 * <p>
 * 1 <= words.length <= 10^4
 * 0 <= words[i].length <= 1000
 * words[i] consists of only lowercase English letters.
 * 0 <= sum(words[i].length) <= 10^5
 */
public class ConcatenatedWords {
    public static void main(String[] args) throws Exception {
        String[] words = {""};
        System.out.println(new ConcatenatedWords().findAllConcatenatedWordsInADict(words));
    }

    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        Set<String> dictionary = new HashSet<>();
        Collections.addAll(dictionary, words);
        List<String> result = new ArrayList<>();
        for (String w : words) {
            if (!w.isEmpty() && concatenatedWordsPossible(w, dictionary)) result.add(w);
        }
        return result;
    }

    private boolean concatenatedWordsPossible(String word, Set<String> dictionary) {
        boolean[] D = new boolean[word.length() + 1];
        D[word.length()] = true;
        dictionary.remove(word); // remove current word from dictionary temporarily
        for (int i = word.length() - 1; i >= 0; i--) {
            for (int j = i, l = word.length(); j < l; j++) {
                String subStr = word.substring(i, j + 1);
                if (dictionary.contains(subStr) && D[j + 1]) {
                    D[i] = true;
                    break;
                }
            }
        }
        dictionary.add(word); // restore deleted word
        return D[0];
    }
}
