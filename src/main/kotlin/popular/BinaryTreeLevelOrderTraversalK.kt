package popular

import utils.TreeNodeK
import java.util.LinkedList

/**
 * Medium
 * Binary Tree Level Order Traversal
 */
class BinaryTreeLevelOrderTraversalK {

    fun levelOrder(root: TreeNodeK?): List<List<Int>> {
        val levels = ArrayList<List<Int>>()
        if (root == null) return levels

        val queue = LinkedList<TreeNodeK>()
        queue.offer(root)

        while (queue.isNotEmpty()) {
            val level = ArrayList<Int>()
            var size = queue.size
            while (size-- > 0) {
                val node = queue.poll()
                level.add(node.value)
                node.left?.let { queue.offer(it) }
                node.right?.let { queue.offer(it) }
            }
            levels.add(level)
        }
        return levels
    }
}

