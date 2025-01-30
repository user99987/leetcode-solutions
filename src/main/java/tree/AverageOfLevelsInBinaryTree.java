package tree;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<Double> averageOfLevels(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        traverse(root, 0, levels);
        return levels.stream()
                .map(level -> level.stream().collect(Collectors.averagingDouble(Integer::doubleValue)))
                .collect(Collectors.toList());
    }

    private void traverse(TreeNode node, int depth, List<List<Integer>> levels) {
        if (node == null) return;
        if (levels.size() == depth) levels.add(new ArrayList<>());
        levels.get(depth).add(node.value);
        traverse(node.left, depth + 1, levels);
        traverse(node.right, depth + 1, levels);
    }

}
