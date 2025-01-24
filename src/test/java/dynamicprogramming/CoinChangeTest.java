package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinChangeTest {

    @Test
    public void testCase1() {
        assertEquals(3, new CoinChange().coinChange(new int[]{1, 2, 5}, 11));
    }

    @Test
    public void testCase2() {
        assertEquals(-1, new CoinChange().coinChange(new int[]{2}, 3));
    }

    @Test
    public void testCase3() {
        assertEquals(0, new CoinChange().coinChange(new int[]{1}, 0));
    }
}
