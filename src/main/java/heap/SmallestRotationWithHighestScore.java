package heap;

/**
 * Hard
 * <p>
 * You are given an array nums. You can rotate it by a non-negative integer k so that the array becomes [nums[k], nums[k + 1], ... nums[nums.length - 1], nums[0], nums[1], ..., nums[k-1]]. Afterward, any entries that are less than or equal to their index are worth one point.
 * <p>
 * For example, if we have nums = [2,4,1,3,0], and we rotate by k = 2, it becomes [1,3,0,2,4]. This is worth 3 points because 1 > 0 [no points], 3 > 1 [no points], 0 <= 2 [one point], 2 <= 3 [one point], 4 <= 4 [one point].
 * Return the rotation index k that corresponds to the highest score we can achieve if we rotated nums by it. If there are multiple answers, return the smallest such index k.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,3,1,4,0]
 * <p>
 * Output: 3
 * <p>
 * Explanation:
 * <p>
 * Scores for each k are listed below:
 * k = 0, nums = [2,3,1,4,0], score 2
 * k = 1, nums = [3,1,4,0,2], score 3
 * k = 2, nums = [1,4,0,2,3], score 3
 * k = 3, nums = [4,0,2,3,1], score 4
 * k = 4, nums = [0,2,3,1,4], score 3
 * So we should choose k = 3, which has the highest score.
 * Example 2:
 * <p>
 * Input: nums = [1,3,0,2,4]
 * <p>
 * Output: 0
 * <p>
 * Explanation:
 * <p>
 * nums will always have 3 points no matter how it shifts.
 * So we will choose the smallest k, which is 0.
 * Constraints:
 * <p>
 * 1 <= nums.length <= 105
 * 0 <= nums[i] < nums.length
 */
public class SmallestRotationWithHighestScore {

    public static void main(String[] args) {
        int[] A = {2, 3, 1, 4, 0};
        System.out.println(new SmallestRotationWithHighestScore().bestRotation(A));
    }

    public int bestRotation(int[] nums) {
        int n = nums.length;
        int res = 0;
        int[] change = new int[n];
        for (int i = 0; i < n; i++) {
            change[(i - nums[i] + 1 + n) % n]--;
        }
        for (int i = 1; i < n; i++) {
            change[i] += change[i - 1] + 1;
            res = change[i] > change[res] ? i : res;
        }
        return res;
    }
}
