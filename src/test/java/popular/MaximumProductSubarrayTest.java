package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumProductSubarrayTest {

    @Test
    public void testCase1() {
        assertEquals(6, new MaximumProductSubarray().maxProduct(new int[]{2, 3, -2, 4}));
    }

    @Test
    public void testCase2() {
        assertEquals(0, new MaximumProductSubarray().maxProduct(new int[]{-2, 0, -1}));
    }
}
