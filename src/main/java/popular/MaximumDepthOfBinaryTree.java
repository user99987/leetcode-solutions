package popular;


import utils.TreeNode;

/**
 * Easy
 * <p>
 * Given the root of a binary tree, return its maximum depth.
 * <p>
 * A binary tree’s maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * <p>
 * Example 1:
 * <p>
 * Input: root = [3,9,20,null,null,15,7]
 * <p>
 * Output: 3
 * <p>
 * Example 2:
 * <p>
 * Input: root = [1,null,2]
 * <p>
 * Output: 2
 * <p>
 * Example 3:
 * <p>
 * Input: root = []
 * <p>
 * Output: 0
 * <p>
 * Example 4:
 * <p>
 * Input: root = [0]
 * <p>
 * Output: 1
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [0, 104].
 * -100 <= Node.val <= 100
 */
public class MaximumDepthOfBinaryTree {

    public static void main(String[] args) throws Exception {
        int[] nums = {3, 9, 20, 15, 7};
        System.out.println(new MaximumDepthOfBinaryTree().maxDepth(build(nums, 0, nums.length - 1)));
    }

    private static TreeNode build(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = build(nums, start, mid - 1);
        root.right = build(nums, mid + 1, end);
        return root;
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
