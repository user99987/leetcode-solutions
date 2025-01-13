package popular;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Given the root of a binary tree, return the zigzag level order traversal of its nodes’ values. (i.e., from left to right, then right to left for the next level and alternate between).
 * <p>
 * Example 1:
 * <p>
 * Input: root = [3,9,20,null,null,15,7]
 * <p>
 * Output: [[3],[20,9],[15,7]]
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
 * -100 <= Node.val <= 100
 */
public class BinaryTreeZigzagLevelOrderTraversal {

    public static void main(String[] args) throws Exception {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.right = new TreeNode(7);
        root.right.left = new TreeNode(15);

        System.out.println(new BinaryTreeZigzagLevelOrderTraversal().zigzagLevelOrder(root));
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        boolean leftToRight = true;
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> temp = new ArrayList<>();
            while (size-- > 0) {
                TreeNode removed = queue.remove();
                temp.add(removed.val);
                if (removed.left != null) {
                    queue.add(removed.left);
                }
                if (removed.right != null) {
                    queue.add(removed.right);
                }
            }
            if (!leftToRight) {
                Collections.reverse(temp);
            }
            ans.add(temp);
            leftToRight = !leftToRight;
        }
        return ans;
    }
}
