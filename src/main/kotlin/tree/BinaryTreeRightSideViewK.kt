package tree

import utils.TreeNodeK

/**
 * Medium
 *
 * Given the root of a binary tree, imagine yourself standing on the right side of it, return
 * the values of the nodes you can see ordered from top to bottom.
 */
class BinaryTreeRightSideViewK {

    fun rightSideView(root: TreeNodeK?): List<Int> {
        val result = ArrayList<Int>()
        dfs(root, 0, intArrayOf(-1), result)
        return result
    }

    private fun dfs(node: TreeNodeK?, depth: Int, maxDepth: IntArray, result: MutableList<Int>) {
        if (node == null) return
        if (depth > maxDepth[0]) {
            result.add(node.value)
            maxDepth[0] = depth
        }
        dfs(node.right, depth + 1, maxDepth, result)
        dfs(node.left, depth + 1, maxDepth, result)
    }
}

