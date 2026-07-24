package popular

import utils.ListNodeK

/**
 * Easy
 * Remove Duplicates from Sorted List
 */
class RemoveDuplicatesK {

    fun deleteDuplicates(head: ListNodeK?): ListNodeK? {
        var current = head
        while (current?.next != null) {
            if (current.value == current.next!!.value) {
                current.next = current.next!!.next
            } else {
                current = current.next
            }
        }
        return head
    }
}

