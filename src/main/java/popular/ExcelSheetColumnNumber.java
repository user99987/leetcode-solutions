package popular;

/**
 * Easy
 * <p>
 * Given a string columnTitle that represents the column title as appear in an Excel sheet, return its corresponding column number.
 * <p>
 * For example:
 * <p>
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 * ...
 * Example 1:
 * <p>
 * Input: columnTitle = "A"
 * <p>
 * Output: 1
 * <p>
 * Example 2:
 * <p>
 * Input: columnTitle = "AB"
 * <p>
 * Output: 28
 * <p>
 * Example 3:
 * <p>
 * Input: columnTitle = "ZY"
 * <p>
 * Output: 701
 * <p>
 * Example 4:
 * <p>
 * Input: columnTitle = "FXSHRXW"
 * <p>
 * Output: 2147483647
 * <p>
 * Constraints:
 * <p>
 * 1 <= columnTitle.length <= 7
 * columnTitle consists only of uppercase English letters.
 * columnTitle is in the range ["A", "FXSHRXW"].
 */
public class ExcelSheetColumnNumber {

    public int titleToNumber(String s) {
        int num = 0;
        int pow = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            num += (int) Math.pow(26, pow++) * (s.charAt(i) - 'A' + 1);
        }
        return num;
    }
}
