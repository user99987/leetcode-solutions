package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContainsDuplicateIITest {

    @Test
    void testCase1() {
        assertTrue(new ContainsDuplicateII().containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
    }

    @Test
    void testCase2() {
        assertTrue(new ContainsDuplicateII().containsNearbyDuplicate(new int[]{1, 0, 0, 1}, 1));
    }

    @Test
    void testCase3() {
        assertFalse(new ContainsDuplicateII().containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
    }
}
