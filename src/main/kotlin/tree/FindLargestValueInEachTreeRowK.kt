package tree

import utils.TreeNodeK
import java.util.LinkedList

/**
 * Medium
 *
 * Given the root of a binary tree, return an array of the largest value in each row of the tree
 * (0-indexed).
 */
class FindLargestValueInEachTreeRowK {

    fun largestValues(root: TreeNodeK?): List<Int> {
        if (root == null) return emptyList()
        val result = ArrayList<Int>()
        var queue = LinkedList(listOf(root))

        while (queue.isNotEmpty()) {
            result.add(queue.maxOf { it.value })
            val nextQueue = LinkedList<TreeNodeK>()
            for (node in queue) {
                node.left?.let { nextQueue.add(it) }
                node.right?.let { nextQueue.add(it) }
            }
            queue = nextQueue
        }
        return result
    }
}

