package string;

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
        for (char c : s.toCharArray()) {
            ++count[c - 'a'];
        }
        digits[0] = count[25];
        digits[2] = count[22];
        digits[4] = count[20];
        digits[6] = count[23];
        digits[8] = count[6];
        digits[1] = count[14] - digits[0] - digits[2] - digits[4];
        digits[3] = count[7] - digits[8];
        digits[5] = count[5] - digits[4];
        digits[7] = count[18] - digits[6];
        digits[9] = count[8] - digits[5] - digits[6] - digits[8];
        for (int i = 0; i < 10; i++) {
            while (digits[i]-- != 0) {
                str.append((char) (i + 48));
            }
        }
        return str.toString();
    }
}
