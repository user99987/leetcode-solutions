package tree

import utils.TreeNodeK
import java.util.ArrayDeque

/**
 * Medium
 *
 * Build a maximum binary tree recursively from nums: the root is the maximum value, with left
 * and right subtrees built from the prefix/suffix around it.
 */
class MaximumBinaryTreeK {

    fun constructMaximumBinaryTree(nums: IntArray): TreeNodeK? {
        val stack = ArrayDeque<TreeNodeK>()
        for (num in nums) {
            val current = TreeNodeK(num)
            while (stack.isNotEmpty() && stack.peek().value < num) {
                current.left = stack.pop()
            }
            if (stack.isNotEmpty()) {
                stack.peek().right = current
            }
            stack.push(current)
        }
        while (stack.size > 1) {
            stack.pop()
        }
        return stack.peek()
    }
}

