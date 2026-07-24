package popular

import utils.TreeNodeK

/**
 * Easy
 * Maximum Depth of Binary Tree
 */
class MaximumDepthOfBinaryTreeK {

    fun maxDepth(root: TreeNodeK?): Int {
        return if (root == null) 0 else 1 + maxOf(maxDepth(root.left), maxDepth(root.right))
    }
}

