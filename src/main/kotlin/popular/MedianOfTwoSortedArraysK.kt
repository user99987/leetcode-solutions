package popular

/**
 * Hard
 * Median of Two Sorted Arrays
 */
class MedianOfTwoSortedArraysK {

    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val total = nums1.size + nums2.size
        val left = (total + 1) / 2
        val right = (total + 2) / 2
        return (findKth(nums1, 0, nums2, 0, left) + findKth(nums1, 0, nums2, 0, right)) / 2.0
    }

    private fun findKth(nums1: IntArray, i: Int, nums2: IntArray, j: Int, k: Int): Int {
        if (i >= nums1.size) return nums2[j + k - 1]
        if (j >= nums2.size) return nums1[i + k - 1]
        if (k == 1) return minOf(nums1[i], nums2[j])

        val idx1 = i + k / 2 - 1
        val midVal1 = if (idx1 < nums1.size) nums1[idx1] else Int.MAX_VALUE

        val idx2 = j + k / 2 - 1
        val midVal2 = if (idx2 < nums2.size) nums2[idx2] else Int.MAX_VALUE

        return if (midVal1 < midVal2) {
            findKth(nums1, i + k / 2, nums2, j, k - k / 2)
        } else {
            findKth(nums1, i, nums2, j + k / 2, k - k / 2)
        }
    }
}

