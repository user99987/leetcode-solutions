package tree

import utils.TreeNodeK
import kotlin.math.abs

/**
 * Easy
 *
 * Given the root of a binary tree, return the sum of every tree node's tilt.
 */
class BinaryTreeTiltK {

    private var totalTilt = 0

    fun findTilt(root: TreeNodeK?): Int {
        totalTilt = 0
        calculateSum(root)
        return totalTilt
    }

    private fun calculateSum(node: TreeNodeK?): Int {
        if (node == null) return 0
        val leftSum = calculateSum(node.left)
        val rightSum = calculateSum(node.right)
        totalTilt += abs(leftSum - rightSum)
        return leftSum + rightSum + node.value
    }
}

