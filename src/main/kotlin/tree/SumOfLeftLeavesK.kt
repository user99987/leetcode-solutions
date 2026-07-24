package tree

import utils.TreeNodeK

/**
 * Easy
 *
 * Given the root of a binary tree, return the sum of all left leaves.
 */
class SumOfLeftLeavesK {

    fun sumOfLeftLeaves(root: TreeNodeK?): Int {
        if (root == null) return 0
        val leftValue = if (isLeaf(root.left)) root.left!!.value else sumOfLeftLeaves(root.left)
        return leftValue + sumOfLeftLeaves(root.right)
    }

    private fun isLeaf(node: TreeNodeK?): Boolean = node != null && node.left == null && node.right == null
}

