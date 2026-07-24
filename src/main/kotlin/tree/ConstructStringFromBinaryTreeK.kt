package tree

import utils.TreeNodeK

/**
 * Easy
 *
 * Given the root of a binary tree, construct a string consisting of parenthesis and integers
 * from a binary tree with the preorder traversal way, and return it.
 */
class ConstructStringFromBinaryTreeK {

    fun tree2str(root: TreeNodeK?): String {
        if (root == null) return ""
        val result = StringBuilder()
        build(root, result)
        return result.toString()
    }

    private fun build(node: TreeNodeK, result: StringBuilder) {
        result.append(node.value)
        if (node.left == null && node.right == null) return
        result.append('(')
        if (node.left != null) {
            build(node.left!!, result)
        }
        result.append(')')
        if (node.right != null) {
            result.append('(')
            build(node.right!!, result)
            result.append(')')
        }
    }
}

