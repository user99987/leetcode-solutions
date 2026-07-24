package popular

/**
 * Medium
 * Populating Next Right Pointers in Each Node
 */
class PopulatingNextRightPointersInEachNodeK {

    fun connect(root: Node?): Node? {
        if (root == null) return null
        var levelStart = root
        while (levelStart!!.left != null) {
            var current: Node? = levelStart
            while (current != null) {
                current.left!!.next = current.right
                if (current.next != null) {
                    current.right!!.next = current.next!!.left
                }
                current = current.next
            }
            levelStart = levelStart.left
        }
        return root
    }

    class Node(val value: Int) {
        var left: Node? = null
        var right: Node? = null
        var next: Node? = null
    }
}

