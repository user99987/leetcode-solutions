package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubArraysWithBoundedMaximumTest {

    @Test
    public void testCase1() {
        assertEquals(3, new SubArraysWithBoundedMaximum().numSubarrayBoundedMax(new int[]{2, 1, 4, 3}, 2, 3));
    }

    @Test
    public void testCase2() {
        assertEquals(7, new SubArraysWithBoundedMaximum().numSubarrayBoundedMax(new int[]{2, 9, 2, 5, 6}, 2, 8));
    }
}
