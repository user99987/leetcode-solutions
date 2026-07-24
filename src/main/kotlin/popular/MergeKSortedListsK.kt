package popular

import utils.ListNodeK
import java.util.PriorityQueue

/**
 * Hard
 * Merge k Sorted Lists
 */
class MergeKSortedListsK {

    fun mergeKLists(lists: Array<ListNodeK?>): ListNodeK? {
        val minHeap = PriorityQueue<ListNodeK>(compareBy { it.value })
        for (node in lists) {
            if (node != null) {
                minHeap.add(node)
            }
        }
        val dummy = ListNodeK(0)
        var current = dummy
        while (minHeap.isNotEmpty()) {
            val minNode = minHeap.poll()
            current.next = minNode
            current = current.next!!
            minNode.next?.let { minHeap.add(it) }
        }
        return dummy.next
    }
}

