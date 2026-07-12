package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class LRUCacheTest {

    @Test
    public void testCase() {
        var cache = new LRUCache(2);
        cache.put(1, 1); // Cache: [1]
        cache.put(2, 2); // Cache: [2, 1]
        assertThat(cache.get(1)).isEqualTo(1); // Access 1, Cache: [1, 2]
        cache.put(3, 3); // Evicts key 2, Cache: [3, 1]
        assertThat(cache.get(2)).isEqualTo(-1); // Key 2 no longer exists
        cache.put(4, 4); // Evicts key 1, Cache: [4, 3]
        assertThat(cache.get(1)).isEqualTo(-1); // Key 1 no longer exists
        assertThat(cache.get(3)).isEqualTo(3); // Access 3, Cache: [3, 4]
        assertThat(cache.get(4)).isEqualTo(4); // Access 4, Cache: [4, 3]
    }
}
