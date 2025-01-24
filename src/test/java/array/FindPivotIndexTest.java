package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindPivotIndexTest {

    @Test
    public void testCase1() {
        assertEquals(3, new FindPivotIndex().pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }

    @Test
    public void testCase2() {
        assertEquals(-1, new FindPivotIndex().pivotIndex(new int[]{1, 2, 3}));
    }

    @Test
    public void testCase3() {
        assertEquals(0, new FindPivotIndex().pivotIndex(new int[]{2, 1, -1}));
    }
}
