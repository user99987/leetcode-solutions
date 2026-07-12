package tree;

import utils.TreeNode;

/**
 * Easy
 * <p>
 * Given the roots of two binary trees root and subRoot, return true if there is a subtree of root with the same structure and node values of subRoot and false otherwise.
 * <p>
 * A subtree of a binary tree is a tree that consists of a node in tree and all of this node's descendants. The tree tree could also be considered as a subtree of itself.
 * <p>
 * Example 1:
 * <p>
 * Input: root = [3,4,5,1,2], subRoot = [4,1,2]
 * <p>
 * Output: true
 * <p>
 * Example 2:
 * <p>
 * Input: root = [3,4,5,1,2,null,null,null,null,0], subRoot = [4,1,2]
 * <p>
 * Output: false
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the root tree is in the range [1, 2000].
 * The number of nodes in the subRoot tree is in the range [1, 1000].
 * -10^4 <= root.val <= 10^4
 * -10^4 <= subRoot.val <= 10^4
 */
public class SubtreeOfAnotherTree {


    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        var tree = new StringBuilder();
        var subtree = new StringBuilder();
        serialize(root, tree);
        serialize(subRoot, subtree);
        return contains(tree, subtree);
    }

    private void serialize(TreeNode node, StringBuilder result) {
        if (node == null) {
            result.append(",#");
            return;
        }
        result.append(',').append(node.value);
        serialize(node.left, result);
        serialize(node.right, result);
    }

    private boolean contains(CharSequence text, CharSequence pattern) {
        int[] lps = buildLps(pattern);
        int j = 0;
        for (int i = 0; i < text.length(); i++) {
            while (j > 0 && text.charAt(i) != pattern.charAt(j)) {
                j = lps[j - 1];
            }
            if (text.charAt(i) == pattern.charAt(j)) {
                j++;
                if (j == pattern.length()) {
                    return true;
                }
            }
        }
        return false;
    }

    private int[] buildLps(CharSequence pattern) {
        var lps = new int[pattern.length()];
        for (int i = 1, length = 0; i < pattern.length(); i++) {
            while (length > 0 && pattern.charAt(i) != pattern.charAt(length)) {
                length = lps[length - 1];
            }
            if (pattern.charAt(i) == pattern.charAt(length)) {
                lps[i] = ++length;
            }
        }
        return lps;
    }
}
