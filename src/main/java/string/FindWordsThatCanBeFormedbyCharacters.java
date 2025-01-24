package string;

import java.util.HashMap;
import java.util.Map;

/**
 * Easy
 * <p>
 * You are given an array of strings words and a string chars.
 * <p>
 * A string is good if it can be formed by characters from chars (each character can only be used once).
 * <p>
 * Return the sum of lengths of all good strings in words.
 * <p>
 * Example 1:
 * <p>
 * Input: words = ["cat","bt","hat","tree"], chars = "atach"
 * <p>
 * Output: 6
 * <p>
 * Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
 * <p>
 * Example 2:
 * <p>
 * Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
 * <p>
 * Output: 10
 * <p>
 * Explanation: The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.
 * <p>
 * Constraints:
 * <p>
 * 1 <= words.length <= 1000
 * 1 <= words[i].length, chars.length <= 100
 * words[i] and chars consist of lowercase English letters.
 */
public class FindWordsThatCanBeFormedbyCharacters {

    public static void main(String[] args) {
        String[] A = {"cat", "bt", "hat", "tree"};
        String chars = "atach";
        System.out.println(new FindWordsThatCanBeFormedbyCharacters().countCharacters(A, chars));
    }

    public int countCharacters(String[] words, String chars) {
        int length = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (char c : chars.toCharArray()) {
            int count = map.getOrDefault(c, 0);
            map.put(c, count + 1);
        }
        for (String word : words) {
            if (canForm(word, map)) {
                length += word.length();
            }
        }
        return length;
    }

    private boolean canForm(String word, final Map<Character, Integer> map) {
        Map<Character, Integer> tmp = new HashMap<>(map);
        for (Character c : word.toCharArray()) {
            if (tmp.containsKey(c) && tmp.get(c) > 0) {
                tmp.compute(c, (k, count) -> count - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
