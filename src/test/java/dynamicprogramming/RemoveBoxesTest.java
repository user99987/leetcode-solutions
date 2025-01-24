package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveBoxesTest {

    @Test
    public void testCase1() {
        assertEquals(23, new RemoveBoxes().removeBoxes(new int[]{1, 3, 2, 2, 2, 3, 4, 3, 1}));
    }

    @Test
    public void testCase2() {
        assertEquals(9, new RemoveBoxes().removeBoxes(new int[]{1, 1, 1}));
    }

    @Test
    public void testCase3() {
        assertEquals(1, new RemoveBoxes().removeBoxes(new int[]{1}));
    }

    @Test
    public void testCase4() {
        assertEquals(0, new RemoveBoxes().removeBoxes(new int[]{}));
    }
}
