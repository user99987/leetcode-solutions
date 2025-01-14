package tree;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Medium
 * <p>
 * Given the root of a binary tree, return an array of the largest value in each row of the tree (0-indexed).
 * <p>
 * Example 1:
 * <p>
 * Input: root = [1,3,2,5,3,null,9]
 * <p>
 * Output: [1,3,9]
 * <p>
 * Example 2:
 * <p>
 * Input: root = [1,2,3]
 * <p>
 * Output: [1,3]
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree will be in the range [0, 10^4].
 * -2^31 <= Node.val <= 2^31 - 1
 */
public class FindLargestValueInEachTreeRow {

    public static void main(String[] args) throws Exception {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(5);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(9);
        System.out.println(new FindLargestValueInEachTreeRow().largestValues(root));
    }

    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.offer(root);
            while (!queue.isEmpty()) {
                int max = Integer.MIN_VALUE;
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    TreeNode curr = queue.poll();
                    max = Math.max(max, curr.val);
                    if (curr.left != null) {
                        queue.offer(curr.left);
                    }
                    if (curr.right != null) {
                        queue.offer(curr.right);
                    }
                }
                list.add(max);
            }
        }
        return list;
    }
}
