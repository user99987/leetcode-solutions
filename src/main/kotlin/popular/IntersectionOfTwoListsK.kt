package popular

import utils.ListNodeK

/**
 * Easy
 * Intersection of Two Linked Lists
 */
class IntersectionOfTwoListsK {

    fun getIntersectionNode(headA: ListNodeK?, headB: ListNodeK?): ListNodeK? {
        var node1 = headA
        var node2 = headB
        while (node1 !== node2) {
            node1 = if (node1 == null) headB else node1.next
            node2 = if (node2 == null) headA else node2.next
        }
        return node1
    }
}

