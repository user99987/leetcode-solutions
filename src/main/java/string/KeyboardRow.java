package string;


import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Easy
 * <p>
 * Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.
 * <p>
 * In the American keyboard:
 * <p>
 * the first row consists of the characters "qwertyuiop",
 * the second row consists of the characters "asdfghjkl", and
 * the third row consists of the characters "zxcvbnm".
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: words = ["Hello","Alaska","Dad","Peace"]
 * <p>
 * Output: ["Alaska","Dad"]
 * <p>
 * Example 2:
 * <p>
 * Input: words = ["omk"]
 * <p>
 * Output: []
 * <p>
 * Example 3:
 * <p>
 * Input: words = ["adsdf","sfd"]
 * <p>
 * Output: ["adsdf","sfd"]
 * <p>
 * Constraints:
 * <p>
 * 1 <= words.length <= 20
 * 1 <= words[i].length <= 100
 * words[i] consists of English letters (both lowercase and uppercase).
 */
public class KeyboardRow {

    private static final Set<Character> ROW1 = "qwertyuiop".chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
    private static final Set<Character> ROW2 = "asdfghjkl".chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
    private static final Set<Character> ROW3 = "zxcvbnm".chars().mapToObj(c -> (char) c).collect(Collectors.toSet());

    public String[] findWords(String[] words) {
        return Arrays.stream(words)
                .filter(word -> {
                    String lowerWord = word.toLowerCase();
                    Set<Character> row = getRow(lowerWord.charAt(0));
                    return lowerWord.chars().allMatch(c -> row.contains((char) c));
                })
                .toArray(String[]::new);
    }

    private Set<Character> getRow(char ch) {
        return ROW1.contains(ch) ? ROW1 : ROW2.contains(ch) ? ROW2 : ROW3;
    }
}
