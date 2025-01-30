package string;

import java.util.stream.IntStream;

/**
 * Medium
 * <p>
 * Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.
 * <p>
 * Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.
 * <p>
 * Example 1:
 * <p>
 * Input: num1 = "2", num2 = "3"
 * <p>
 * Output: "6"
 * <p>
 * Example 2:
 * <p>
 * Input: num1 = "123", num2 = "456"
 * <p>
 * Output: "56088"
 * <p>
 * Constraints:
 * <p>
 * 1 <= num1.length, num2.length <= 200
 * num1 and num2 consist of digits only.
 * Both num1 and num2 do not contain any leading zero, except the number 0 itself.
 */
public class MultiplyStrings {

    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";

        int len1 = num1.length(), len2 = num2.length();
        int[] result = new int[len1 + len2];

        IntStream.range(0, len1).forEach(i ->
                IntStream.range(0, len2).forEach(j -> {
                    int product = (num1.charAt(len1 - 1 - i) - '0') * (num2.charAt(len2 - 1 - j) - '0');
                    int sum = product + result[len1 + len2 - 1 - (i + j)];

                    result[len1 + len2 - 1 - (i + j)] = sum % 10;
                    result[len1 + len2 - 2 - (i + j)] += sum / 10;
                })
        );

        return IntStream.of(result)
                .dropWhile(digit -> digit == 0)
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }
}
