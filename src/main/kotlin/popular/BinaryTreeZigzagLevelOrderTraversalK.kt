package popular

import utils.TreeNodeK
import java.util.LinkedList

/**
 * Binary Tree Zigzag Level Order Traversal
 */
class BinaryTreeZigzagLevelOrderTraversalK {

    fun zigzagLevelOrder(root: TreeNodeK?): List<List<Int>> {
        val levels = ArrayList<List<Int>>()
        if (root == null) return levels

        val queue = LinkedList<TreeNodeK>()
        queue.offer(root)
        var leftToRight = true

        while (queue.isNotEmpty()) {
            val level = ArrayList<Int>()
            var size = queue.size
            while (size-- > 0) {
                val node = queue.poll()
                if (leftToRight) level.add(node.value) else level.add(0, node.value)
                node.left?.let { queue.offer(it) }
                node.right?.let { queue.offer(it) }
            }
            levels.add(level)
            leftToRight = !leftToRight
        }
        return levels
    }
}

