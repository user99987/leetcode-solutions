package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CanIWinTest {

    @Test
    public void testCase1() {
        assertFalse(new CanIWin().canIWin(10, 11));
    }

    @Test
    public void testCase2() {
        assertTrue(new CanIWin().canIWin(10, 0));
    }

    @Test
    public void testCase3() {
        assertTrue(new CanIWin().canIWin(10, 1));
    }
}
