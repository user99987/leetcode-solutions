package popular;

import java.util.HashMap;
import java.util.Map;

/**
 * Medium
 * <p>
 * Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.
 * <p>
 * Implement the LRUCache class:
 * <p>
 * LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
 * int get(int key) Return the value of the key if the key exists, otherwise return -1.
 * void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.
 * The functions get and put must each run in O(1) average time complexity.
 * <p>
 * Example 1:
 * <p>
 * Input ["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"] [[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]
 * <p>
 * Output: [null, null, null, 1, null, -1, null, -1, 3, 4]
 * <p>
 * Constraints:
 * <p>
 * 1 <= capacity <= 3000
 * 0 <= key <= 10^4
 * 0 <= value <= 10^5
 * At most 2 * 10^5 calls will be made to get and put.
 */
public class LRUCache {

    private final int capacity;
    private final Map<Integer, LruCacheNode> cacheMap = new HashMap<>();
    private LruCacheNode head, tail;

    public LRUCache(int cap) {
        capacity = cap;
    }

    public int get(int key) {
        var val = cacheMap.get(key);
        if (val == null) return -1;
        moveToHead(val);
        return val.value;
    }

    public void put(int key, int value) {
        var valNode = cacheMap.get(key);
        if (valNode != null) {
            valNode.value = value;
            moveToHead(valNode);
            return;
        }
        if (cacheMap.size() == capacity) {
            cacheMap.remove(tail.key);
            tail = tail.prev;
            if (tail != null) tail.next = null;
        }
        var node = new LruCacheNode(key, value);
        cacheMap.put(key, node);
        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    private void moveToHead(LruCacheNode node) {
        if (node == head) return;
        if (node == tail) tail = node.prev;
        if (node.prev != null) node.prev.next = node.next;
        if (node.next != null) node.next.prev = node.prev;
        node.prev = null;
        node.next = head;
        head.prev = node;
        head = node;
    }

    private static class LruCacheNode {
        int key, value;
        LruCacheNode prev, next;

        public LruCacheNode(int k, int v) {
            key = k;
            value = v;
        }
    }
}
