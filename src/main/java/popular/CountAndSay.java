package popular;

/**
 * Medium
 * <p>
 * The count-and-say sequence is a sequence of digit strings defined by the recursive formula:
 * <p>
 * countAndSay(1) = "1"
 * countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1), which is then converted into a different digit string.
 * To determine how you "say" a digit string, split it into the minimal number of groups so that each group is a contiguous section all of the same character. Then for each group, say the number of characters, then say the character. To convert the saying into a digit string, replace the counts with a number and concatenate every saying.
 * <p>
 * For example, the saying and conversion for digit string "3322251":
 * <p>
 * <p>
 * <p>
 * Given a positive integer n, return the nth term of the count-and-say sequence.
 * <p>
 * Example 1:
 * <p>
 * Input: n = 1
 * <p>
 * Output: "1"
 * <p>
 * Explanation: This is the base case.
 * <p>
 * Example 2:
 * <p>
 * Input: n = 4
 * <p>
 * Output: "1211"
 * <p>
 * Explanation:
 * <p>
 * countAndSay(1) = "1"
 * countAndSay(2) = say "1" = one 1 = "11"
 * countAndSay(3) = say "11" = two 1's = "21"
 * countAndSay(4) = say "21" = one 2 + one 1 = "12" + "11" = "1211"
 * Constraints:
 * <p>
 * 1 <= n <= 30
 */
public class CountAndSay {

    public String countAndSay(int n) {
        if (n == 1) return "1";
        String prev = countAndSay(n - 1);
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 1; i < prev.length(); i++) {
            if (prev.charAt(i) == prev.charAt(i - 1)) {
                count++;
            } else {
                result.append(count).append(prev.charAt(i - 1));
                count = 1;
            }
        }
        result.append(count).append(prev.charAt(prev.length() - 1));
        return result.toString();
    }
}
