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
    // insert here
    private LruCacheNode head;
    // remove here
    private LruCacheNode tail;

    public LRUCache(int cap) {
        capacity = cap;
    }

    public int get(int key) {
        LruCacheNode val = cacheMap.get(key);
        if (val == null) {
            return -1;
        }
        moveToHead(val);
        return val.value;
    }

    /*
     * Scenarios :
     * 1. Value key is already present.
     *          update
     *          move node to head
     * 2. cache is not full
     *          cache is empty (create node and assign head and tail)
     *          cache is partially empty (add node to head and update head pointer)
     * 3. cache is full
     *          remove node at tail, update head, tail pointers
     *          Recursively call put
     *
     *
     * move node to head Scenarios
     * 1. node is at head
     * 2. node is at tail
     * 3. node is in middle
     *
     */
    public void put(int key, int value) {
        LruCacheNode valNode = cacheMap.get(key);
        if (valNode != null) {
            valNode.value = value;
            moveToHead(valNode);
        } else {
            if (cacheMap.size() < capacity) {
                if (cacheMap.isEmpty()) {
                    LruCacheNode node = new LruCacheNode(key, value);
                    cacheMap.put(key, node);
                    head = node;
                    tail = node;
                } else {
                    LruCacheNode node = new LruCacheNode(key, value);
                    cacheMap.put(key, node);
                    node.next = head;
                    head.prev = node;
                    head = node;
                }
            } else {
                // remove from tail
                LruCacheNode last = tail;
                tail = last.prev;
                if (tail != null) {
                    tail.next = null;
                }
                cacheMap.remove(last.key);
                if (cacheMap.isEmpty()) {
                    head = null;
                }
                // Call recursively
                put(key, value);
            }
        }
    }

    /*
     * check for 3 conditions
     * 1. node is already at head
     * 2. Node is tail node
     * 3. Node in middle node
     */
    private void moveToHead(LruCacheNode node) {
        if (node == head) {
            return;
        }
        if (node == tail) {
            tail = node.prev;
        }
        // node is not head, it should have some valid prev node
        LruCacheNode prev = node.prev;
        LruCacheNode next = node.next;
        prev.next = next;
        if (next != null) {
            next.prev = prev;
        }
        node.prev = null;
        node.next = head;
        head.prev = node;
        head = node;
    }

    private static class LruCacheNode {
        int key;
        int value;
        LruCacheNode prev;
        LruCacheNode next;

        public LruCacheNode(int k, int v) {
            key = k;
            value = v;
        }
    }
}
