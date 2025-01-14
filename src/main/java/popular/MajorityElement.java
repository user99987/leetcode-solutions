package popular;

/**
 * Easy
 * <p>
 * Given an array nums of size n, return the majority element.
 * <p>
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [3,2,3]
 * <p>
 * Output: 3
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [2,2,1,1,1,2,2]
 * <p>
 * Output: 2
 * <p>
 * Constraints:
 * <p>
 * n == nums.length
 * 1 <= n <= 5 * 10^4
 * -2^31 <= nums[i] <= 2^31 - 1
 */
class MajorityElement {

    public static void main(String[] args) throws Exception {
        System.out.println(new MajorityElement().majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }

    public int majorityElement(int[] nums) {
        int majorityElement = nums[0];
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                majorityElement = num;
            }
            count += num == majorityElement ? 1 : -1;
        }
        return majorityElement;
    }
}
