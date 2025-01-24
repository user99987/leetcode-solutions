package backtracking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TargetSumTest {

    @Test
    public void testCase1() {
        assertEquals(5, new TargetSum().findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3));
    }

    @Test
    public void testCase2() {
        assertEquals(1, new TargetSum().findTargetSumWays(new int[]{1}, 1));
    }

    @Test
    public void testCase3() {
        assertEquals(0, new TargetSum().findTargetSumWays(new int[]{1, 2, 3}, 7));
    }
}
