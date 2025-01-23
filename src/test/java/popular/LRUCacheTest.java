package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LRUCacheTest {

    @Test
    public void testCase() {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1); // Cache: [1]
        cache.put(2, 2); // Cache: [2, 1]
        assertEquals(1, cache.get(1)); // Access 1, Cache: [1, 2]
        cache.put(3, 3); // Evicts key 2, Cache: [3, 1]
        assertEquals(-1, cache.get(2)); // Key 2 no longer exists
        cache.put(4, 4); // Evicts key 1, Cache: [4, 3]
        assertEquals(-1, cache.get(1)); // Key 1 no longer exists
        assertEquals(3, cache.get(3)); // Access 3, Cache: [3, 4]
        assertEquals(4, cache.get(4)); // Access 4, Cache: [4, 3]
    }
}
