package tree

import utils.TreeNodeK
import java.util.ArrayDeque

/**
 * Easy
 *
 * Given the root of a binary tree, return the average value of the nodes on each level in the
 * form of an array.
 */
class AverageOfLevelsInBinaryTreeK {

    fun averageOfLevels(root: TreeNodeK?): List<Double> {
        if (root == null) return emptyList()
        val result = ArrayList<Double>()
        val queue = ArrayDeque<TreeNodeK>()
        queue.offer(root)
        while (queue.isNotEmpty()) {
            val levelSize = queue.size
            var sum = 0L
            for (i in 0 until levelSize) {
                val node = queue.poll()
                sum += node.value
                if (node.left != null) queue.offer(node.left)
                if (node.right != null) queue.offer(node.right)
            }
            result.add(sum / levelSize.toDouble())
        }
        return result
    }
}

