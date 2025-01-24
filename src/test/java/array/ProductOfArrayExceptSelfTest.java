package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ProductOfArrayExceptSelfTest {

    @Test
    public void testCase1() {
        assertArrayEquals(new int[]{24, 12, 8, 6}, new ProductOfArrayExceptSelf().productExceptSelf(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void testCase2() {
        assertArrayEquals(new int[]{0, 0, 9, 0, 0}, new ProductOfArrayExceptSelf().productExceptSelf(new int[]{-1, 1, 0, -3, 3}));
    }
}
