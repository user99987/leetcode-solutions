package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OnesAndZeroesTest {

    @Test
    public void testCase1() {
        assertEquals(4, new OnesAndZeroes().findMaxForm(
                new String[]{"10", "0001", "111001", "1", "0"}, 5, 3));
    }

    @Test
    public void testCase2() {
        assertEquals(2, new OnesAndZeroes().findMaxForm(
                new String[]{"10", "0", "1"}, 1, 1));
    }

    @Test
    public void testCase3() {
        assertEquals(3, new OnesAndZeroes().findMaxForm(
                new String[]{"10", "0001", "1"}, 4, 3));
    }
}
