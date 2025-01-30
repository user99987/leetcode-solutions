package string;

import java.util.stream.IntStream;

/**
 * Medium
 * <p>
 * Given a string s containing an out-of-order English representation of digits 0-9, return the digits in ascending order.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "owoztneoer"
 * <p>
 * Output: "012"
 * <p>
 * Example 2:
 * <p>
 * Input: s = "fviefuro"
 * <p>
 * Output: "45"
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 105
 * s[i] is one of the characters ["e","g","f","i","h","o","n","s","r","u","t","w","v","x","z"].
 * s is guaranteed to be valid.
 */
public class ReconstructOriginalDigitsFromEnglish {


    public String originalDigits(String s) {
        int[] count = new int[26];
        int[] digits = new int[10];
        StringBuilder str = new StringBuilder();

        s.chars().forEach(c -> ++count[c - 'a']);

        digits[0] = count['z' - 'a'];
        digits[2] = count['w' - 'a'];
        digits[4] = count['u' - 'a'];
        digits[6] = count['x' - 'a'];
        digits[8] = count['g' - 'a'];
        digits[1] = count['o' - 'a'] - digits[0] - digits[2] - digits[4];
        digits[3] = count['h' - 'a'] - digits[8];
        digits[5] = count['f' - 'a'] - digits[4];
        digits[7] = count['s' - 'a'] - digits[6];
        digits[9] = count['i' - 'a'] - digits[5] - digits[6] - digits[8];

        IntStream.range(0, 10)
                .forEach(i -> IntStream.range(0, digits[i])
                        .forEach(j -> str.append(i)));

        return str.toString();
    }
}
