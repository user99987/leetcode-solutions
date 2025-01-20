package popular;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Medium
 * <p>
 * Given the root of a binary tree, return the level order traversal of its nodes’ values. (i.e., from left to right, level by level).
 * <p>
 * Example 1:
 * <p>
 * Input: root = [3,9,20,null,null,15,7]
 * <p>
 * Output: [[3],[9,20],[15,7]]
 * <p>
 * Example 2:
 * <p>
 * Input: root = [1]
 * <p>
 * Output: [[1]]
 * <p>
 * Example 3:
 * <p>
 * Input: root = []
 * <p>
 * Output: []
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [0, 2000].
 * -1000 <= Node.val <= 1000
 */
public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>(); // Initialize list to store level order traversal
        if (root == null) return result; // Check for empty tree

        Queue<TreeNode> queue = new LinkedList<>(); // Initialize queue for BFS traversal
        queue.offer(root); // Enqueue the root node

        while (!queue.isEmpty()) {
            int levelSize = queue.size(); // Get the number of nodes in the current level
            List<Integer> level = new ArrayList<>(); // Initialize list for the current level

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll(); // Dequeue the front node
                assert node != null;
                level.add(node.val); // Add node value to the current level list

                // Enqueue the left and right children if they exist
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            result.add(level); // Add the current level list to the result list
        }

        return result; // Return the level order traversal
    }

}
