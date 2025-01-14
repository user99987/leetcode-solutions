package popular;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Medium
 * <p>
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
 * <p>
 * A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
 * <p>
 * Example 1:
 * <p>
 * Input: digits = “23”
 * <p>
 * Output: [“ad”,”ae”,”af”,”bd”,”be”,”bf”,”cd”,”ce”,”cf”]
 * <p>
 * Example 2:
 * <p>
 * Input: digits = “”
 * <p>
 * Output: []
 * <p>
 * Example 3:
 * <p>
 * Input: digits = “2”
 * <p>
 * Output: [“a”,”b”,”c”]
 * <p>
 * Constraints:
 * <p>
 * 0 <= digits.length <= 4
 * digits[i] is a digit in the range ['2', '9'].
 */
public class LetterCombinationsOfPhoneNumber {

    public static void main(String[] args) {
        LetterCombinationsOfPhoneNumber solution = new LetterCombinationsOfPhoneNumber();

        // Test cases
        String digits1 = "23";
        System.out.println("Example 1 Output: " + solution.letterCombinations(digits1));

        String digits2 = "";
        System.out.println("Example 2 Output: " + solution.letterCombinations(digits2));

        String digits3 = "2";
        System.out.println("Example 3 Output: " + solution.letterCombinations(digits3));
    }

    private static final Map<Character, String> DIGIT_TO_CHAR_MAPPING = Map.of(
            '2', "abc",
            '3', "def",
            '4', "ghi",
            '5', "jkl",
            '6', "mno",
            '7', "pqrs",
            '8', "tuv",
            '9', "wxyz"
    );

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        letterCombinations(digits, 0, new StringBuilder(), result);
        return result;
    }

    private void letterCombinations(String digits, int idx, StringBuilder sb, List<String> result) {
        if (idx == digits.length()) {
            if (!sb.isEmpty()) {
                result.add(sb.toString());
            }
            return;
        }
        for (char c : DIGIT_TO_CHAR_MAPPING.get(digits.charAt(idx)).toCharArray()) {
            sb.append(c);
            letterCombinations(digits, idx + 1, sb, result);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
