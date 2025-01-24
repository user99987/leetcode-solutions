package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayNestingTest {

    @Test
    public void testCase1() {
        assertEquals(4, new ArrayNesting().arrayNesting(new int[]{5, 4, 0, 3, 1, 6, 2}));
    }

    @Test
    public void testCase2() {
        assertEquals(1, new ArrayNesting().arrayNesting(new int[]{0, 1, 2}));
    }
}
