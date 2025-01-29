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
 * Input: digits = "23"
 * <p>
 * Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
 * <p>
 * Example 2:
 * <p>
 * Input: digits = ""
 * <p>
 * Output: []
 * <p>
 * Example 3:
 * <p>
 * Input: digits = "2"
 * <p>
 * Output: ["a","b","c"]
 * <p>
 * Constraints:
 * <p>
 * 0 <= digits.length <= 4
 * digits[i] is a digit in the range ['2', '9'].
 */
public class LetterCombinationsOfPhoneNumber {

    private static final Map<Character, String> DIGIT_TO_CHAR_MAPPING = Map.of(
            '2', "abc", '3', "def", '4', "ghi", '5', "jkl",
            '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz"
    );

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return new ArrayList<>();
        return digits.chars()
                .mapToObj(c -> DIGIT_TO_CHAR_MAPPING.get((char) c))
                .map(s -> s.chars().mapToObj(ch -> String.valueOf((char) ch)).toList())
                .reduce((list1, list2) -> list1.stream()
                        .flatMap(str -> list2.stream().map(str::concat))
                        .toList())
                .orElse(List.of());
    }
}
