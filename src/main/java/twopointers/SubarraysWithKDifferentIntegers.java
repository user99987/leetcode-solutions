package twopointers;

/**
 * Hard
 * <p>
 * Given an integer array nums and an integer k, return the number of good subarrays of nums.
 * <p>
 * A good array is an array where the number of different integers in that array is exactly k.
 * <p>
 * For example, [1,2,3,1,2] has 3 different integers: 1, 2, and 3.
 * A subarray is a contiguous part of an array.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,1,2,3], k = 2
 * <p>
 * Output: 7
 * <p>
 * Explanation: Subarrays formed with exactly 2 different integers: [1,2], [2,1], [1,2], [2,3], [1,2,1], [2,1,2], [1,2,1,2]
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [1,2,1,3,4], k = 3
 * <p>
 * Output: 3
 * <p>
 * Explanation: Subarrays formed with exactly 3 different integers: [1,2,1,3], [2,1,3], [1,3,4].
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 2 * 104
 * 1 <= nums[i], k <= nums.length
 */
public class SubarraysWithKDifferentIntegers {

    public static void main(String[] args) {
        int[] A = {1, 2, 1, 2, 3};
        SubarraysWithKDifferentIntegers task = new SubarraysWithKDifferentIntegers();
        System.out.println(task.subarraysWithKDistinct(A, 2));
    }

    public int subarraysWithKDistinct(int[] A, int K) {
        return calculate(A, K) - calculate(A, K - 1);
    }

    private int calculate(int[] A, int K) {
        int count = 0;
        int[] frequency = new int[A.length + 1];
        int currCount = 0;
        for (int i = 0, j = 0; i < A.length; i++) {
            frequency[A[i]]++;
            if (frequency[A[i]] == 1) {
                currCount++;
            }
            while (currCount > K) {
                frequency[A[j]]--;
                if (frequency[A[j]] == 0) {
                    currCount--;
                }
                j++;
            }
            count += (i - j + 1);
        }
        return count;
    }
}
