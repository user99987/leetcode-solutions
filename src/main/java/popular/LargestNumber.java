package popular;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Medium
 * <p>
 * Given a list of non-negative integers nums, arrange them such that they form the largest number.
 * <p>
 * Note: The result may be very large, so you need to return a string instead of an integer.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [10,2]
 * <p>
 * Output: “210”
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [3,30,34,5,9]
 * <p>
 * Output: “9534330”
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [1]
 * <p>
 * Output: “1”
 * <p>
 * Example 4:
 * <p>
 * Input: nums = [10]
 * <p>
 * Output: “10”
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 100
 * 0 <= nums[i] <= 109
 */
public class LargestNumber {

    public static void main(String[] args) throws Exception {
        System.out.println(new LargestNumber().largestNumber(new int[]{3, 30, 34, 5, 9}));
    }

    public String largestNumber(int[] nums) {
        String largestNum = Arrays.stream(nums)
                .boxed()
                .map(String::valueOf)
                .sorted((o1, o2) -> (o2 + o1).compareTo(o1 + o2))
                .collect(Collectors.joining(""));
        return largestNum.charAt(0) == '0' ? "0" : largestNum;
    }
}
