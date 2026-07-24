package linkedlist

import utils.ListNodeK

/**
 * Medium
 *
 * You are given the head of a linked list with n nodes.
 *
 * For each node in the list, find the value of the next greater node.
 */
class NextGreaterNodeInLinkedListK {

    fun nextLargerNodes(head: ListNodeK?): IntArray {
        var size = 0
        var node = head
        while (node != null) {
            size++
            node = node.next
        }

        val values = IntArray(size)
        var index = 0
        node = head
        while (node != null) {
            values[index++] = node.value
            node = node.next
        }

        val result = IntArray(size)
        val stack = IntArray(size)
        var top = -1

        for (i in 0 until size) {
            while (top >= 0 && values[stack[top]] < values[i]) {
                result[stack[top--]] = values[i]
            }
            stack[++top] = i
        }

        return result
    }
}

