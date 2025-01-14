package string;

/**
 * Medium
 * <p>
 * Given an input string s, reverse the order of the words.
 * <p>
 * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
 * <p>
 * Return a string of the words in reverse order concatenated by a single space.
 * <p>
 * Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
 * <p>
 * Example 1:
 * <p>
 * Input: s = “the sky is blue”
 * <p>
 * Output: “blue is sky the”
 * <p>
 * Example 2:
 * <p>
 * Input: s = “ hello world “
 * <p>
 * Output: “world hello”
 * <p>
 * Explanation: Your reversed string should not contain leading or trailing spaces.
 * <p>
 * Example 3:
 * <p>
 * Input: s = “a good example”
 * <p>
 * Output: “example good a”
 * <p>
 * Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 * <p>
 * Example 4:
 * <p>
 * Input: s = “ Bob Loves Alice “
 * <p>
 * Output: “Alice Loves Bob”
 * <p>
 * Example 5:
 * <p>
 * Input: s = “Alice does not even like bob”
 * <p>
 * Output: “bob like even not does Alice”
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 10^4
 * s contains English letters (upper-case and lower-case), digits, and spaces ' '.
 * There is at least one word in s.
 */
public class ReverseWordsInAString {

    public static void main(String[] args) throws Exception {
        System.out.println(new ReverseWordsInAString().reverseWords(" Bob Loves Alice "));
    }

    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;
        while (i >= 0) {
            if (s.charAt(i) == ' ') {
                i--;
                continue;
            }
            int start = s.lastIndexOf(' ', i);
            sb.append(' ');
            sb.append(s, start + 1, i + 1);
            i = start - 1;
        }
        if (!sb.isEmpty()) {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}
