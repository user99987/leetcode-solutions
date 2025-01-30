package tree;

import utils.TreeNode;

import java.util.stream.IntStream;

/**
 * Medium
 * <p>
 * You are given an integer array nums with no duplicates. A maximum binary tree can be built recursively from nums using the following algorithm:
 * <p>
 * Create a root node whose value is the maximum value in nums.
 * Recursively build the left subtree on the subarray prefix to the left of the maximum value.
 * Recursively build the right subtree on the subarray suffix to the right of the maximum value.
 * Return the maximum binary tree built from nums.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [3,2,1,6,0,5]
 * <p>
 * Output: [6,3,5,null,2,0,null,null,1]
 * <p>
 * Explanation: The recursive calls are as follow:
 * <p>
 * The largest value in [3,2,1,6,0,5] is 6. Left prefix is [3,2,1] and right suffix is [0,5].
 * <p>
 * The largest value in [3,2,1] is 3. Left prefix is [] and right suffix is [2,1].
 * <p>
 * Empty array, so no child.
 * <p>
 * The largest value in [2,1] is 2. Left prefix is [] and right suffix is [1].
 * <p>
 * Empty array, so no child.
 * <p>
 * Only one element, so child is a node with value 1.
 * <p>
 * The largest value in [0,5] is 5. Left prefix is [0] and right suffix is [].
 * <p>
 * Only one element, so child is a node with value 0.
 * <p>
 * Empty array, so no child.
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [3,2,1]
 * <p>
 * Output: [3,null,2,null,1]
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 1000
 * 0 <= nums[i] <= 1000
 * All integers in nums are unique.
 */
public class MaximumBinaryTree {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return buildTree(nums, 0, nums.length - 1);
    }

    private TreeNode buildTree(int[] nums, int left, int right) {
        if (left > right) return null;
        int maxIndex = IntStream.rangeClosed(left, right)
                .reduce((a, b) -> nums[a] > nums[b] ? a : b)
                .orElse(left);
        TreeNode root = new TreeNode(nums[maxIndex]);
        root.left = buildTree(nums, left, maxIndex - 1);
        root.right = buildTree(nums, maxIndex + 1, right);
        return root;
    }

}
