package tree

import utils.TreeNodeK

/**
 * Easy
 *
 * Given the root of a binary tree, return the postorder traversal of its nodes' values.
 */
class BinaryTreePostorderTraversalK {

    fun postorderTraversal(root: TreeNodeK?): List<Int> {
        val result = ArrayList<Int>()
        traverse(root, result)
        return result
    }

    private fun traverse(node: TreeNodeK?, result: MutableList<Int>) {
        if (node == null) return
        traverse(node.left, result)
        traverse(node.right, result)
        result.add(node.value)
    }
}

