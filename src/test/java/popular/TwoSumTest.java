package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {

    @Test
    public void testCase1() {
        assertArrayEquals(new int[]{0, 1}, new TwoSum().twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    public void testCase2() {
        assertArrayEquals(new int[]{1, 2}, new TwoSum().twoSum(new int[]{3, 2, 4}, 6));
    }

    @Test
    public void testCase3() {
        assertArrayEquals(new int[]{0, 1}, new TwoSum().twoSum(new int[]{3, 3}, 6));
    }
}
