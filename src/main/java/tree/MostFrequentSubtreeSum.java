package tree;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
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
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        fun(root, hm);
        int maxvalue = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> map : hm.entrySet()) {
            if (map.getValue() > maxvalue) {
                maxvalue = map.getValue();
            }
        }
        for (Map.Entry<Integer, Integer> map : hm.entrySet()) {
            if (map.getValue() == maxvalue) {
                arr.add(map.getKey());
            }
        }
        int[] newArr = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            newArr[i] = arr.get(i);
        }
        return newArr;
    }

    private int fun(TreeNode node, HashMap<Integer, Integer> hm) {
        if (node == null) {
            return 0;
        }
        int left = fun(node.left, hm);
        int right = fun(node.right, hm);
        int sum = node.value + left + right;
        if (hm.containsKey(sum)) {
            hm.put(sum, hm.get(sum) + 1);
        } else {
            hm.put(sum, 0);
        }
        return sum;
    }
}
