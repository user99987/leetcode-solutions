package string;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * Easy
 * <p>
 * Given two strings s and t, determine if they are isomorphic.
 * <p>
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * <p>
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "egg", t = "add"
 * <p>
 * Output: true
 * <p>
 * Example 2:
 * <p>
 * Input: s = "foo", t = "bar"
 * <p>
 * Output: false
 * <p>
 * Example 3:
 * <p>
 * Input: s = "paper", t = "title"
 * <p>
 * Output: true
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 5 * 10^4
 * t.length == s.length
 * s and t consist of any valid ascii character.
 */
public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Character> forwardMap = new HashMap<>();
        Map<Character, Character> reverseMap = new HashMap<>();

        return IntStream.range(0, s.length()).allMatch(i -> {
            char source = s.charAt(i);
            char target = t.charAt(i);

            if (forwardMap.getOrDefault(source, target) != target ||
                    reverseMap.getOrDefault(target, source) != source) {
                return false;
            }

            forwardMap.put(source, target);
            reverseMap.put(target, source);
            return true;
        });
    }
}
