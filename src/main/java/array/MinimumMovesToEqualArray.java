package array;

/**
 * Medium
 * <p>
 * Given an integer array nums of size n, return the minimum number of moves required to make all array elements equal.
 * <p>
 * In one move, you can increment n - 1 elements of the array by 1.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3]
 * <p>
 * Output: 3
 * <p>
 * Explanation: Only three moves are needed (remember each move increments two elements): [1,2,3] => [2,3,3] => [3,4,3] => [4,4,4]
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [1,1,1]
 * <p>
 * Output: 0
 * <p>
 * Constraints:
 * <p>
 * n == nums.length
 * 1 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 * The answer is guaranteed to fit in a 32-bit integer.
 */
public class MinimumMovesToEqualArray {

    public static void main(String[] args) throws Exception {
        int[] A = {1, 2, 3};
        System.out.println(new MinimumMovesToEqualArray().minMoves(A));
    }

    public int minMoves(int[] nums) {
        int min = nums[0];
        int sum = nums[0];
        for (int i = 1; i <= nums.length - 1; i++) {
            sum += nums[i];
            min = Math.min(min, nums[i]);
        }
        return sum - (min * nums.length);
    }
}
