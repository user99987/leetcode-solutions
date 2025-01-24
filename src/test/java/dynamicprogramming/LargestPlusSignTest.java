package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargestPlusSignTest {

    @Test
    public void testCase1() {
        assertEquals(2, new LargestPlusSign().orderOfLargestPlusSign(5, new int[][]{{4, 2}}));
    }

    @Test
    public void testCase2() {
        assertEquals(0, new LargestPlusSign().orderOfLargestPlusSign(1, new int[][]{{0, 0}}));
    }
}
