package string;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

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
        Map<Character, Long> charMap = chars.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return Arrays.stream(words)
                .filter(word -> canForm(word, charMap))
                .mapToInt(String::length)
                .sum();
    }

    private boolean canForm(String word, Map<Character, Long> charMap) {
        Map<Character, Long> wordMap = word.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return wordMap.entrySet().stream()
                .allMatch(entry -> charMap.getOrDefault(entry.getKey(), 0L) >= entry.getValue());
    }
}
