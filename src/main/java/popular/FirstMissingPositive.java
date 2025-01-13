package popular;

/**
 * Hard
 * <p>
 * Given an unsorted integer array nums, return the smallest missing positive integer.
 * <p>
 * You must implement an algorithm that runs in O(n) time and uses constant extra space.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,0]
 * <p>
 * Output: 3
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [3,4,-1,1]
 * <p>
 * Output: 2
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [7,8,9,11,12]
 * <p>
 * Output: 1
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 5 * 10^5
 * -2^31 <= nums[i] <= 2^31 - 1
 */
public class FirstMissingPositive {
    private int L;

    public static void main(String[] args) throws Exception {
        int[] nums = {1, 3, 5, 9};
        System.out.println(new FirstMissingPositive().firstMissingPositive(nums));
    }

    public int firstMissingPositive(int[] nums) {
        L = nums.length;
        for (int i = 0; i < L; i++) {
            if (nums[i] > 0 && nums[i] <= L && nums[i] != i + 1) {
                int v = nums[i];
                nums[i] = -1;
                replace(v, nums);
            }
        }

        for (int i = 0; i < L; i++) {
            if (nums[i] != i + 1) return i + 1;
        }

        return L + 1;
    }

    private void replace(int i, int[] nums) {
        if (i > 0 && i <= L && i != nums[i - 1]) {
            int v = nums[i - 1];
            nums[i - 1] = i;
            replace(v, nums);
        }
    }
}
