package string;

import java.util.HashMap;
import java.util.Map;

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
 * Input: s = “egg”, t = “add”
 * <p>
 * Output: true
 * <p>
 * Example 2:
 * <p>
 * Input: s = “foo”, t = “bar”
 * <p>
 * Output: false
 * <p>
 * Example 3:
 * <p>
 * Input: s = “paper”, t = “title”
 * <p>
 * Output: true
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 5 * 104
 * t.length == s.length
 * s and t consist of any valid ascii character.
 */
public class IsomorphicStrings {

    public static void main(String[] args) throws Exception {
        System.out.println(new IsomorphicStrings().isIsomorphic("egg", "add"));
    }

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Character> first = new HashMap<>();
        Map<Character, Character> second = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (first.containsKey(c)) {
                char secondC = first.get(c);
                if (t.charAt(i) != secondC) return false;
            } else {
                first.put(c, t.charAt(i));
                if (second.containsKey(t.charAt(i))) return false;
                second.put(t.charAt(i), c);
            }
        }
        return true;
    }
}
