package tree;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Easy
 * <p>
 * Given the root of a binary tree, return the average value of the nodes on each level in the form of an array. Answers within 10-5 of the actual answer will be accepted.
 * <p>
 * Example 1:
 * <p>
 * Input: root = [3,9,20,null,null,15,7]
 * <p>
 * Output: [3.00000,14.50000,11.00000] Explanation: The average value of nodes on level 0 is 3, on level 1 is 14.5, and on level 2 is 11. Hence return [3, 14.5, 11].
 * <p>
 * Example 2:
 * <p>
 * Input: root = [3,9,20,15,7]
 * <p>
 * Output: [3.00000,14.50000,11.00000]
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [1, 10^4].
 * -2^31 <= Node.val <= 2^31 - 1
 */
public class AverageOfLevelsInBinaryTree {

    public static void main(String[] args) throws Exception {
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20);
        node1.left = node2;
        node1.right = node3;
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);
        node3.left = node4;
        node3.right = node5;
        System.out.println(new AverageOfLevelsInBinaryTree().averageOfLevels(node1));
    }

    public List<Double> averageOfLevels(TreeNode root) {
        Map<Integer, Double[]> map = new HashMap<>();
        helper(root, map, 0);
        List<Double> result = new ArrayList<>();
        for (Double[] pair : map.values()) {
            double avg = pair[1] / pair[0];
            result.add(avg);
        }
        return result;
    }

    private void helper(TreeNode root, Map<Integer, Double[]> map, int level) {
        if (root == null) {
            return;
        }
        Double[] pair = map.containsKey(level) ? map.get(level) : new Double[]{0.0, 0.0};
        pair[0] += 1;
        pair[1] += root.val;
        map.put(level, pair);
        helper(root.left, map, level + 1);
        helper(root.right, map, level + 1);
    }

}
