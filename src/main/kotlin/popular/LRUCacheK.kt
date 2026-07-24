package popular

/**
 * Medium
 * LRU Cache
 */
class LRUCacheK(private val capacity: Int) {

    private val cacheMap = HashMap<Int, LruCacheNode>()
    private var head: LruCacheNode? = null
    private var tail: LruCacheNode? = null

    fun get(key: Int): Int {
        val value = cacheMap[key] ?: return -1
        moveToHead(value)
        return value.value
    }

    fun put(key: Int, value: Int) {
        val valNode = cacheMap[key]
        if (valNode != null) {
            valNode.value = value
            moveToHead(valNode)
            return
        }
        if (cacheMap.size == capacity) {
            cacheMap.remove(tail!!.key)
            tail = tail!!.prev
            tail?.next = null
        }
        val node = LruCacheNode(key, value)
        cacheMap[key] = node
        if (head == null) {
            head = node
            tail = node
        } else {
            node.next = head
            head!!.prev = node
            head = node
        }
    }

    private fun moveToHead(node: LruCacheNode) {
        if (node === head) return
        if (node === tail) tail = node.prev
        node.prev?.next = node.next
        node.next?.prev = node.prev
        node.prev = null
        node.next = head
        head?.prev = node
        head = node
    }

    private class LruCacheNode(val key: Int, var value: Int) {
        var prev: LruCacheNode? = null
        var next: LruCacheNode? = null
    }
}

