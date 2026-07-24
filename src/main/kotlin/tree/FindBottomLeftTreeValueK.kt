package tree

import utils.TreeNodeK

/**
 * Medium
 *
 * Given the root of a binary tree, return the leftmost value in the last row of the tree.
 */
class FindBottomLeftTreeValueK {

    private var maxDepth = 0
    private var leftMostValue = 0

    fun findBottomLeftValue(root: TreeNodeK?): Int {
        dfs(root, 1)
        return leftMostValue
    }

    private fun dfs(node: TreeNodeK?, depth: Int) {
        if (node == null) return
        if (depth > maxDepth) {
            maxDepth = depth
            leftMostValue = node.value
        }
        dfs(node.left, depth + 1)
        dfs(node.right, depth + 1)
    }
}

