package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumCostToMergeStonesTest {

    @Test
    public void testCase1() {
        assertEquals(20, new MinimumCostToMergeStones().mergeStones(new int[]{3, 2, 4, 1}, 2));
    }

    @Test
    public void testCase2() {
        assertEquals(-1, new MinimumCostToMergeStones().mergeStones(new int[]{3, 2, 4, 1}, 3));
    }

    @Test
    public void testCase3() {
        assertEquals(25, new MinimumCostToMergeStones().mergeStones(new int[]{3, 5, 1, 2, 6}, 3));
    }
}
