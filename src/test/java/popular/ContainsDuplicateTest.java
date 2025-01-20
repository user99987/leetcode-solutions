package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContainsDuplicateTest {

    @Test
    void testCase1() {
        assertTrue(new ContainsDuplicate().containsDuplicate(new int[]{1, 2, 3, 1}));
    }

    @Test
    void testCase2() {
        assertFalse(new ContainsDuplicate().containsDuplicate(new int[]{1, 2, 3, 4}));
    }

    @Test
    void testCase3() {
        assertTrue(new ContainsDuplicate().containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }
}
