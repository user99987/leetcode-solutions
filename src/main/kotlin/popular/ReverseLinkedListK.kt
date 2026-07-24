package popular

import utils.ListNodeK

/**
 * Easy
 * Reverse Linked List
 */
class ReverseLinkedListK {

    fun reverseList(head: ListNodeK?): ListNodeK? {
        var previous: ListNodeK? = null
        var current = head
        while (current != null) {
            val next = current.next
            current.next = previous
            previous = current
            current = next
        }
        return previous
    }
}

