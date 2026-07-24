package popular

import utils.TreeNodeK
import java.util.LinkedList

/**
 * Easy
 * Binary Tree Inorder Traversal
 */
class BinaryTreeInorderTraversalK {

    fun inorderTraversal(rootNode: TreeNodeK?): List<Int> {
        val inorder = ArrayList<Int>()
        val stack = LinkedList<TreeNodeK>()
        var curr = rootNode

        while (curr != null || stack.isNotEmpty()) {
            while (curr != null) {
                stack.push(curr)
                curr = curr.left
            }
            curr = stack.pop()
            inorder.add(curr.value)
            curr = curr.right
        }

        return inorder
    }
}

