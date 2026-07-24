package popular

/**
 * Hard
 * LFU Cache
 */
class LFUCacheK(private val capacity: Int) {

    private val endOfBlock = HashMap<Int, Node>()
    private val map = HashMap<Int, Node>()
    private val linkedList = Node()

    fun get(key: Int): Int {
        if (!map.containsKey(key)) return -1
        val newEndNode = map[key]!!
        val currEndNode = endOfBlock[newEndNode.freq]

        if (currEndNode === newEndNode) {
            findNewEndOfBlock(newEndNode)
            if (currEndNode.next == null || currEndNode.next!!.freq > newEndNode.freq + 1) {
                newEndNode.freq++
                endOfBlock[newEndNode.freq] = newEndNode
                return newEndNode.value
            }
        }

        newEndNode.next?.prev = newEndNode.prev
        newEndNode.prev?.next = newEndNode.next
        newEndNode.freq++

        val endNode = if (currEndNode!!.next == null || currEndNode.next!!.freq > newEndNode.freq) {
            currEndNode
        } else {
            endOfBlock[newEndNode.freq]!!
        }

        endOfBlock[newEndNode.freq] = newEndNode
        endNode.next?.prev = newEndNode
        newEndNode.next = endNode.next
        endNode.next = newEndNode
        newEndNode.prev = endNode

        return newEndNode.value
    }

    fun put(key: Int, value: Int) {
        if (capacity == 0) return

        map[key]?.let {
            it.value = value
            get(key)
            return
        }

        if (map.size == capacity) {
            val toDelete = linkedList.next!!
            map.remove(toDelete.key)
            linkedList.next = toDelete.next
            toDelete.next?.prev = linkedList
            if (endOfBlock[toDelete.freq] === toDelete) endOfBlock.remove(toDelete.freq)
        }

        val newEndNode = Node(key, value)
        map[key] = newEndNode
        val endNode = endOfBlock.getOrDefault(1, linkedList)
        endOfBlock[1] = newEndNode

        endNode.next?.prev = newEndNode
        newEndNode.next = endNode.next
        endNode.next = newEndNode
        newEndNode.prev = endNode
    }

    private fun findNewEndOfBlock(node: Node) {
        val prev = node.prev
        if (prev != null && prev.freq == node.freq) {
            endOfBlock[node.freq] = prev
        } else {
            endOfBlock.remove(node.freq)
        }
    }

    private class Node(var key: Int = 0, var value: Int = 0) {
        var prev: Node? = null
        var next: Node? = null
        var freq: Int = 1
    }
}

