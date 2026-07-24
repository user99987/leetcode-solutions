package popular

import utils.ListNodeK

/**
 * Medium
 * Sort List
 */
class SortListK {

    fun sortList(head: ListNodeK?): ListNodeK? {
        if (head?.next == null) {
            return head
        }

        val middle = split(head)
        val left = sortList(head)
        val right = sortList(middle)
        return merge(left, right)
    }

    private fun split(head: ListNodeK): ListNodeK? {
        var slow = head
        var fast = head.next

        while (fast?.next != null) {
            slow = slow.next!!
            fast = fast.next!!.next
        }

        val middle = slow.next
        slow.next = null
        return middle
    }

    private fun merge(leftInput: ListNodeK?, rightInput: ListNodeK?): ListNodeK? {
        val dummy = ListNodeK()
        var tail = dummy
        var left = leftInput
        var right = rightInput

        while (left != null && right != null) {
            if (left.value <= right.value) {
                tail.next = left
                left = left.next
            } else {
                tail.next = right
                right = right.next
            }
            tail = tail.next!!
        }

        tail.next = left ?: right
        return dummy.next
    }
}

