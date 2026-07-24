package tree

import utils.TreeNodeK

/**
 * Medium
 *
 * The values of exactly two nodes of a binary search tree were swapped by mistake. Recover the
 * tree without changing its structure.
 */
class RecoverBinarySearchTreeK {

    private var previous: TreeNodeK? = null
    private var first: TreeNodeK? = null
    private var second: TreeNodeK? = null

    fun recoverTree(root: TreeNodeK?) {
        previous = null
        first = null
        second = null
        inorder(root)
        if (first != null && second != null) {
            val temp = first!!.value
            first!!.value = second!!.value
            second!!.value = temp
        }
    }

    private fun inorder(node: TreeNodeK?) {
        if (node != null) {
            inorder(node.left)
            if (previous != null && previous!!.value > node.value) {
                if (first == null) {
                    first = previous
                }
                second = node
            }
            previous = node
            inorder(node.right)
        }
    }
}

