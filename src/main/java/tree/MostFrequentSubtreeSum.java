package tree;

import utils.TreeNode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Medium
 * <p>
 * Given the root of a binary tree, return the most frequent subtree sum. If there is a tie, return all the values with the highest frequency in any order.
 * <p>
 * The subtree sum of a node is defined as the sum of all the node values formed by the subtree rooted at that node (including the node itself).
 * <p>
 * Example 1:
 * <p>
 * Input: root = [5,2,-3]
 * <p>
 * Output: [2,-3,4]
 * <p>
 * Example 2:
 * <p>
 * Input: root = [5,2,-5]
 * <p>
 * Output: [2]c
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [1, 10^4].
 * -105 <= Node.val <= 10^5
 */
public class MostFrequentSubtreeSum {

    public int[] findFrequentTreeSum(TreeNode root) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        computeSum(root, freqMap);
        int maxFreq = freqMap.values().stream().max(Integer::compare).orElse(0);
        List<Integer> result = freqMap.entrySet().stream()
                .filter(e -> e.getValue() == maxFreq)
                .map(Map.Entry::getKey)
                .toList();
        return result.stream().mapToInt(i -> i).toArray();
    }

    private int computeSum(TreeNode node, Map<Integer, Integer> freqMap) {
        if (node == null) return 0;
        int sum = node.value + computeSum(node.left, freqMap) + computeSum(node.right, freqMap);
        freqMap.merge(sum, 1, Integer::sum);
        return sum;
    }
}
