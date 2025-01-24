package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StoneGameTest {

    @Test
    public void testCase1() {
        int[] piles = {5, 3, 4, 5};
        assertTrue(new StoneGame().stoneGame(piles));
    }

    @Test
    public void testCase2() {
        int[] piles = {3, 7, 2, 3};
        assertTrue(new StoneGame().stoneGame(piles));
    }

}

