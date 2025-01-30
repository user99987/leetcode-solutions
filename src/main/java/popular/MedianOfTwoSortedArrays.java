package popular;

import java.util.stream.IntStream;

/**
 * Hard
 * <p>
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 * <p>
 * The overall run time complexity should be O(log (m+n)).
 * <p>
 * Example 1:
 * <p>
 * Input: nums1 = [1,3], nums2 = [2]
 * <p>
 * Output: 2.00000
 * <p>
 * Explanation: merged array = [1,2,3] and median is 2.
 * <p>
 * Example 2:
 * <p>
 * Input: nums1 = [1,2], nums2 = [3,4]
 * <p>
 * Output: 2.50000
 * <p>
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 * <p>
 * Example 3:
 * <p>
 * Input: nums1 = [0,0], nums2 = [0,0]
 * <p>
 * Output: 0.00000
 * <p>
 * Example 4:
 * <p>
 * Input: nums1 = [], nums2 = [1]
 * <p>
 * Output: 1.00000
 * <p>
 * Example 5:
 * <p>
 * Input: nums1 = [2], nums2 = []
 * <p>
 * Output: 2.00000
 * <p>
 * Constraints:
 * <p>
 * nums1.length == m
 * nums2.length == n
 * 0 <= m <= 1000
 * 0 <= n <= 1000
 * 1 <= m + n <= 2000
 * -10^6 <= nums1[i], nums2[i] <= 10^6
 */
public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = nums1.length + nums2.length;
        int left = (total + 1) / 2, right = (total + 2) / 2;
        return (findKth(nums1, 0, nums2, 0, left) + findKth(nums1, 0, nums2, 0, right)) / 2.0;
    }

    private int findKth(int[] nums1, int i, int[] nums2, int j, int k) {
        if (i >= nums1.length) return nums2[j + k - 1];
        if (j >= nums2.length) return nums1[i + k - 1];
        if (k == 1) return Math.min(nums1[i], nums2[j]);

        int midVal1 = IntStream.of(i + k / 2 - 1)
                .filter(idx -> idx < nums1.length)
                .map(idx -> nums1[idx])
                .findFirst()
                .orElse(Integer.MAX_VALUE);

        int midVal2 = IntStream.of(j + k / 2 - 1)
                .filter(idx -> idx < nums2.length)
                .map(idx -> nums2[idx])
                .findFirst()
                .orElse(Integer.MAX_VALUE);

        return midVal1 < midVal2
                ? findKth(nums1, i + k / 2, nums2, j, k - k / 2)
                : findKth(nums1, i, nums2, j + k / 2, k - k / 2);
    }
}
