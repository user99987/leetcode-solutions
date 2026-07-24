package linkedlist

import utils.ListNodeK

/**
 * Medium
 *
 * Given a linked list, swap every two adjacent nodes and return its head. You must solve the
 * problem without modifying the values in the list's nodes.
 */
class SwapNodesInPairsK {

    fun swapPairs(head: ListNodeK?): ListNodeK? {
        val dummy = ListNodeK(0)
        dummy.next = head
        var prev = dummy

        while (prev.next != null && prev.next!!.next != null) {
            val first = prev.next!!
            val second = first.next!!

            prev.next = second
            first.next = second.next
            second.next = first
            prev = first
        }

        return dummy.next
    }
}

