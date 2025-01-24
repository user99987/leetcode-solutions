package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConstrainedSubsequenceSumTest {

    @Test
    public void testCase1() {
        assertEquals(37, new ConstrainedSubsequenceSum().constrainedSubsetSum(new int[]{10, 2, -10, 5, 20}, 2));
    }

    @Test
    public void testCase2() {
        assertEquals(-1, new ConstrainedSubsequenceSum().constrainedSubsetSum(new int[]{-1, -2, -3}, 1));
    }

    @Test
    public void testCase3() {
        assertEquals(23, new ConstrainedSubsequenceSum().constrainedSubsetSum(new int[]{10, -2, -10, -5, 20}, 2));
    }
}
