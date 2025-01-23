package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortColorsTest {

    @Test
    public void testCase1() {
        int[] nums = {2, 0, 2, 1, 1, 0};
        new SortColors().sortColors(nums);
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, nums);
    }

    @Test
    public void testCase2() {
        int[] nums = {2, 0, 1};
        new SortColors().sortColors(nums);
        assertArrayEquals(new int[]{0, 1, 2}, nums);
    }

    @Test
    public void testCase3() {
        int[] nums = {0};
        new SortColors().sortColors(nums);
        assertArrayEquals(new int[]{0}, nums);
    }

    @Test
    public void testCase4() {
        int[] nums = {1};
        new SortColors().sortColors(nums);
        assertArrayEquals(new int[]{1}, nums);
    }
}
