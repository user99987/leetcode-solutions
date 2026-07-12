package string;

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
public class FindWordsThatCanBeFormedByCharacters {

    public int countCharacters(String[] words, String chars) {
        var available = new int[26];
        for (var i = 0; i < chars.length(); i++) {
            available[chars.charAt(i) - 'a']++;
        }

        var totalLength = 0;
        for (var word : words) {
            if (canForm(word, available)) {
                totalLength += word.length();
            }
        }
        return totalLength;
    }

    private boolean canForm(String word, int[] available) {
        var remaining = available.clone();
        for (var i = 0; i < word.length(); i++) {
            if (--remaining[word.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
