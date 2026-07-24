package popular

import utils.TreeNodeK

/**
 * Hard
 * Binary Tree Maximum Path Sum
 */
class BinaryTreeMaximumPathSumK {

    private var maxSum = 0

    fun maxPathSum(root: TreeNodeK?): Int {
        maxSum = Int.MIN_VALUE
        dfs(root)
        return maxSum
    }

    private fun dfs(node: TreeNodeK?): Int {
        if (node == null) return 0
        val left = maxOf(dfs(node.left), 0)
        val right = maxOf(dfs(node.right), 0)
        maxSum = maxOf(maxSum, node.value + left + right)
        return node.value + maxOf(left, right)
    }
}

