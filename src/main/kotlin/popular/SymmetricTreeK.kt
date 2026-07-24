package popular

import utils.TreeNodeK

/**
 * Easy
 * Symmetric Tree
 */
class SymmetricTreeK {

    fun isSymmetric(root: TreeNodeK?): Boolean {
        return root == null || isMirror(root.left, root.right)
    }

    private fun isMirror(left: TreeNodeK?, right: TreeNodeK?): Boolean {
        return if (left == null || right == null) {
            left == right
        } else {
            left.value == right.value && isMirror(left.left, right.right) && isMirror(left.right, right.left)
        }
    }
}

