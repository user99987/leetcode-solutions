package popular

import utils.ListNodeK

/**
 * Easy
 * Linked List Cycle
 */
class LinkedListCycleK {

    fun hasCycle(head: ListNodeK?): Boolean {
        var fast = head
        var slow = head
        while (fast?.next != null) {
            fast = fast.next!!.next
            slow = slow!!.next
            if (fast === slow) return true
        }
        return false
    }
}

