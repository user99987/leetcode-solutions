package popular

import utils.ListNodeK

/**
 * Easy
 * Merge Two Sorted Lists
 */
class MergeTwoSortedListK {

    fun mergeTwoLists(l1Input: ListNodeK?, l2Input: ListNodeK?): ListNodeK? {
        val dummy = ListNodeK()
        var tail = dummy
        var l1 = l1Input
        var l2 = l2Input

        while (l1 != null && l2 != null) {
            if (l1.value <= l2.value) {
                tail.next = l1
                l1 = l1.next
            } else {
                tail.next = l2
                l2 = l2.next
            }
            tail = tail.next!!
        }

        tail.next = l1 ?: l2
        return dummy.next
    }
}

