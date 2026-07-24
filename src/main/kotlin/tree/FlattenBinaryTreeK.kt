package tree

import utils.TreeNodeK
import java.util.LinkedList

/**
 * Medium
 *
 * Given the root of a binary tree, flatten the tree into a "linked list" in pre-order.
 */
class FlattenBinaryTreeK {

    fun flatten(root: TreeNodeK?) {
        if (root == null) return
        val stack = LinkedList<TreeNodeK>()
        stack.push(root)

        while (stack.isNotEmpty()) {
            val node = stack.pop()
            if (node.right != null) stack.push(node.right)
            if (node.left != null) stack.push(node.left)
            node.right = stack.peek()
            node.left = null
        }
    }
}

