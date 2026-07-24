package tree

import utils.TreeNodeK
import kotlin.math.max

/**
 * Easy
 *
 * Given the root of a binary tree, return the length of the diameter of the tree.
 */
class DiameterOfBinaryTreeK {

    private var diameter = 0

    fun diameterOfBinaryTree(root: TreeNodeK?): Int {
        diameter = 0
        depth(root)
        return diameter
    }

    private fun depth(node: TreeNodeK?): Int {
        if (node == null) return 0
        val left = depth(node.left)
        val right = depth(node.right)
        diameter = max(diameter, left + right)
        return max(left, right) + 1
    }
}

