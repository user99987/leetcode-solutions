package popular

import utils.ListNodeK

/**
 * Medium
 * Add Two Numbers
 */
class AddTwoNumbersK {

    fun addTwoNumbers(l1Input: ListNodeK?, l2Input: ListNodeK?): ListNodeK? {
        val dummy = ListNodeK()
        var current = dummy
        var carry = 0
        var l1 = l1Input
        var l2 = l2Input

        while (l1 != null || l2 != null || carry > 0) {
            if (l1 != null) {
                carry += l1.value
                l1 = l1.next
            }
            if (l2 != null) {
                carry += l2.value
                l2 = l2.next
            }
            current.next = ListNodeK(carry % 10)
            current = current.next!!
            carry /= 10
        }

        return dummy.next
    }
}

