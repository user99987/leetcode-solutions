package linkedlist

import utils.ListNodeK

/**
 * Medium
 *
 * Given the head of a singly linked list and an integer k, split the linked list into k
 * consecutive linked list parts.
 */
class SplitLinkedListInPartsK {

    fun splitListToParts(head: ListNodeK?, k: Int): Array<ListNodeK?> {
        val len = getLength(head)
        val minSize = len / k
        var extra = len % k
        val result = arrayOfNulls<ListNodeK>(k)

        var current = head
        for (i in 0 until k) {
            result[i] = current
            val size = minSize + (if (extra-- > 0) 1 else 0)
            var j = 1
            while (j < size && current != null) {
                current = current.next
                j++
            }
            if (current != null) {
                val temp = current
                current = current.next
                temp.next = null
            }
        }
        return result
    }

    private fun getLength(root: ListNodeK?): Int {
        var len = 0
        var node = root
        while (node != null) {
            len++
            node = node.next
        }
        return len
    }
}

