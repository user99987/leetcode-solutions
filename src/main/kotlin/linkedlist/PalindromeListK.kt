package linkedlist

import utils.ListNodeK

/**
 * Easy
 *
 * Given the head of a singly linked list, return true if it is a palindrome.
 */
class PalindromeListK {

    fun isPalindrome(head: ListNodeK?): Boolean {
        if (head == null || head.next == null) {
            return true
        }

        var slow: ListNodeK? = head
        var fast: ListNodeK? = head
        var prev: ListNodeK? = null
        while (fast != null && fast.next != null) {
            fast = fast.next!!.next
            val next = slow!!.next
            slow.next = prev
            prev = slow
            slow = next
        }

        if (fast != null) {
            slow = slow!!.next
        }

        while (prev != null) {
            if (prev.value != slow!!.value) {
                return false
            }
            prev = prev.next
            slow = slow.next
        }

        return true
    }
}

