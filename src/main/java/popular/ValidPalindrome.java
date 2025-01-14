package popular;

/**
 * Easy
 * <p>
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 * <p>
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * <p>
 * Example 1:
 * <p>
 * Input: s = “A man, a plan, a canal: Panama”
 * <p>
 * Output: true
 * <p>
 * Explanation: “amanaplanacanalpanama” is a palindrome.
 * <p>
 * Example 2:
 * <p>
 * Input: s = “race a car”
 * <p>
 * Output: false
 * <p>
 * Explanation: “raceacar” is not a palindrome.
 * <p>
 * Example 3:
 * <p>
 * Input: s = “ “
 * <p>
 * Output: true
 * <p>
 * Explanation: s is an empty string “” after removing non-alphanumeric characters. Since an empty string reads the same forward and backward, it is a palindrome.
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 2 * 105
 * s consists only of printable ASCII characters.
 */
public class ValidPalindrome {

    public static void main(String[] args) throws Exception {
        System.out.println(new ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama"));
    }

    public boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) return true;
        s = s.toLowerCase();
        for (int i = 0, j = s.length() - 1; i < j; ) {
            char f = s.charAt(i);
            char l = s.charAt(j);
            if (!(f >= 'a' && f <= 'z') && !(f >= '0' && f <= '9')) {
                i++;
                continue;
            }
            if (!(l >= 'a' && l <= 'z') && !(l >= '0' && l <= '9')) {
                j--;
                continue;
            }
            if (f != l) return false;
            i++;
            j--;
        }
        return true;
    }
}
