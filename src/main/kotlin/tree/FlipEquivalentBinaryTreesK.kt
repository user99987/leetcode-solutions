package tree

import utils.TreeNodeK

/**
 * Medium
 *
 * Given the roots of two binary trees, return true if the two trees are flip equivalent
 * (equal after some number of left/right child swap operations) or false otherwise.
 */
class FlipEquivalentBinaryTreesK {

    fun flipEquiv(root1: TreeNodeK?, root2: TreeNodeK?): Boolean {
        if (root1 == null || root2 == null) return root1 == root2
        if (root1.value != root2.value) return false
        if (sameValue(root1.left, root2.left) && sameValue(root1.right, root2.right)) {
            return flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right)
        }
        if (sameValue(root1.left, root2.right) && sameValue(root1.right, root2.left)) {
            return flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left)
        }
        return false
    }

    private fun sameValue(first: TreeNodeK?, second: TreeNodeK?): Boolean =
        if (first == null) second == null else second != null && first.value == second.value
}

