package popular

import utils.TreeNodeK

/**
 * Easy
 * Convert Sorted Array to Binary Search Tree
 */
class ConvertSortedArrayToBinarySearchTreeK {

    fun sortedArrayToBST(nums: IntArray): TreeNodeK? {
        return buildTree(nums, 0, nums.size - 1)
    }

    private fun buildTree(nums: IntArray, left: Int, right: Int): TreeNodeK? {
        if (left > right) return null
        val mid = left + (right - left) / 2
        val root = TreeNodeK(nums[mid])
        root.left = buildTree(nums, left, mid - 1)
        root.right = buildTree(nums, mid + 1, right)
        return root
    }
}

