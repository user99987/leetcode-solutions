package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BurstBalloonsTest {

    @Test
    public void testCase1() {
        assertEquals(167, new BurstBalloons().maxCoins(new int[]{3, 1, 5, 8}));
    }

    @Test
    public void testCase2() {
        assertEquals(10, new BurstBalloons().maxCoins(new int[]{1, 5}));
    }
}
