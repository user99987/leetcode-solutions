package linkedlist

import utils.ListNodeK

/**
 * Easy
 *
 * Write a function to delete a node in a singly-linked list. You will not be given access to the
 * head of the list, instead you will be given access to the node to be deleted directly.
 *
 * It is guaranteed that the node to be deleted is not a tail node in the list.
 */
class DeleteNodeK {

    fun deleteNode(node: ListNodeK) {
        node.value = node.next!!.value
        node.next = node.next!!.next
    }
}

