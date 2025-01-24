package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CanPlaceFlowersTest {

    @Test
    public void testCase1() {
        assertTrue(new CanPlaceFlowers().canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
    }

    @Test
    public void testCase2() {
        assertFalse(new CanPlaceFlowers().canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));
    }

    @Test
    public void testCase3() {
        assertTrue(new CanPlaceFlowers().canPlaceFlowers(new int[]{0, 0, 1, 0, 0}, 2));
    }
}
