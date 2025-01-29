package popular;

import java.util.HashSet;
import java.util.Set;

/**
 * Easy
 * <p>
 * Write an algorithm to determine if a number n is happy.
 * <p>
 * A happy number is a number defined by the following process:
 * <p>
 * Starting with any positive integer, replace the number by the sum of the squares of its digits.
 * Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy.
 * Return true if n is a happy number, and false if not.
 * <p>
 * Example 1:
 * <p>
 * Input: n = 19
 * <p>
 * Output: true
 * <p>
 * Explanation:
 * <p>
 * 12 + 92 = 82
 * <p>
 * 82 + 22 = 68
 * <p>
 * 62 + 82 = 100
 * <p>
 * 12 + 02 + 02 = 1
 * <p>
 * Example 2:
 * <p>
 * Input: n = 2
 * <p>
 * Output: false
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 231 - 1
 */
public class HappyNumber {

    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getSumOfSquares(n);
        }
        return n == 1;
    }

    private int getSumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

}
