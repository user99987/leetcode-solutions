package popular

import utils.TreeNodeK

/**
 * Medium
 * Construct Binary Search Tree from Preorder Traversal
 */
class ConstructBinarySearchTreeFromPreorderTraversalK {

    fun bstFromPreorder(preorder: IntArray): TreeNodeK? {
        return build(preorder, intArrayOf(0), Int.MAX_VALUE)
    }

    private fun build(preorder: IntArray, index: IntArray, bound: Int): TreeNodeK? {
        if (index[0] == preorder.size || preorder[index[0]] > bound) return null
        val node = TreeNodeK(preorder[index[0]++])
        node.left = build(preorder, index, node.value)
        node.right = build(preorder, index, bound)
        return node
    }
}

