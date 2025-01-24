package twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MoveZeroesTest {

    @Test
    public void testCase1() {
        int[] nums = {0, 1, 0, 3, 12};
        int[] expected = {1, 3, 12, 0, 0};
        new MoveZeroes().moveZeroes(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void testCase2() {
        int[] nums = {0};
        int[] expected = {0};
        new MoveZeroes().moveZeroes(nums);
        assertArrayEquals(expected, nums);
    }
}
