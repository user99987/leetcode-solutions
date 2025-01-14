package string;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * Input: words = [“Hello”,”Alaska”,”Dad”,”Peace”]
 * <p>
 * Output: [“Alaska”,”Dad”]
 * <p>
 * Example 2:
 * <p>
 * Input: words = [“omk”]
 * <p>
 * Output: []
 * <p>
 * Example 3:
 * <p>
 * Input: words = [“adsdf”,”sfd”]
 * <p>
 * Output: [“adsdf”,”sfd”]
 * <p>
 * Constraints:
 * <p>
 * 1 <= words.length <= 20
 * 1 <= words[i].length <= 100
 * words[i] consists of English letters (both lowercase and uppercase).
 */
public class KeyboardRow {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new KeyboardRow().findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"})));
    }

    private boolean check(String str, String word) {
        for (char ch : word.toCharArray()) {
            if (str.indexOf(ch) < 0) {
                return false;
            }
        }
        return true;
    }

    public String[] findWords(String[] words) {
        List<String> arr = new ArrayList<>();
        for (String word : words) {
            String w = word.toLowerCase();
            if (check("qwertyuiop", w) || check("asdfghjkl", w) || check("zxcvbnm", w)) {
                arr.add(word);
            }
        }
        String[] ans = new String[arr.size()];
        ans = arr.toArray(ans);
        return ans;
    }
}
