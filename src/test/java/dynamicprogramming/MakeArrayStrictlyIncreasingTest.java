package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MakeArrayStrictlyIncreasingTest {

    @Test
    public void testCase1() {
        assertEquals(1, new MakeArrayStrictlyIncreasing().makeArrayIncreasing(new int[]{1, 5, 3, 6, 7}, new int[]{1, 3, 2, 4}));
    }

    @Test
    public void testCase2() {
        assertEquals(2, new MakeArrayStrictlyIncreasing().makeArrayIncreasing(new int[]{1, 5, 3, 6, 7}, new int[]{4, 3, 1}));
    }

    @Test
    public void testCase3() {
        assertEquals(-1, new MakeArrayStrictlyIncreasing().makeArrayIncreasing(new int[]{1, 5, 3, 6, 7}, new int[]{1, 6, 3, 3}));
    }
}
