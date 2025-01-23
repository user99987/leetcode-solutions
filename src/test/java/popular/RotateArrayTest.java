package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RotateArrayTest {

    @Test
    public void testCase1() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        new RotateArray().rotate(nums, 3);
        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, nums);
    }

    @Test
    public void testCase2() {
        int[] nums = {-1, -100, 3, 99};
        new RotateArray().rotate(nums, 2);
        assertArrayEquals(new int[]{3, 99, -1, -100}, nums);
    }
}
