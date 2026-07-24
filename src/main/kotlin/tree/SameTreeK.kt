package tree

import utils.TreeNodeK

/**
 * Easy
 *
 * Given the roots of two binary trees p and q, check if they are structurally identical with
 * the same node values.
 */
class SameTreeK {

    fun isSameTree(p: TreeNodeK?, q: TreeNodeK?): Boolean {
        if (p == null && q == null) return true
        return p != null && q != null && p.value == q.value &&
            isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
    }
}

