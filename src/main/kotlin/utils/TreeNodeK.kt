package utils

import java.util.LinkedList

class TreeNodeK @JvmOverloads constructor(
    @JvmField var value: Int,
    @JvmField var left: TreeNodeK? = null,
    @JvmField var right: TreeNodeK? = null,
) {

    companion object {
        @JvmStatic
        fun create(values: Array<Int?>): TreeNodeK? {
            if (values.isEmpty() || values[0] == null) return null
            val root = TreeNodeK(values[0]!!)
            val queue = LinkedList<TreeNodeK?>()
            queue.offer(root)
            var index = 1
            while (index < values.size) {
                val current = queue.poll()
                if (current != null) {
                    val leftVal = values[index++]
                    if (leftVal != null) {
                        current.left = TreeNodeK(leftVal)
                    }
                    queue.offer(current.left)

                    if (index < values.size) {
                        val rightVal = values[index++]
                        if (rightVal != null) {
                            current.right = TreeNodeK(rightVal)
                        }
                        queue.offer(current.right)
                    }
                }
            }
            return root
        }

        @JvmStatic
        fun toList(root: TreeNodeK?): List<Int?> {
            val result = ArrayList<Int?>()
            val queue = LinkedList<TreeNodeK?>()
            if (root == null) return result
            queue.offer(root)
            while (queue.isNotEmpty()) {
                val current = queue.poll()
                if (current != null) {
                    result.add(current.value)
                    queue.offer(current.left)
                    queue.offer(current.right)
                }
            }
            var i = result.size - 1
            while (i >= 0 && result[i] == null) i--
            return result.subList(0, i + 1)
        }
    }
}

