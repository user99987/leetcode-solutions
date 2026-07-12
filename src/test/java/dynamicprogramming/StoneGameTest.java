package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StoneGameTest {

    @Test
    public void testCase1() {
        int[] piles = {5, 3, 4, 5};
        assertThat(new StoneGame().stoneGame(piles)).isTrue();
    }

    @Test
    public void testCase2() {
        int[] piles = {3, 7, 2, 3};
        assertThat(new StoneGame().stoneGame(piles)).isTrue();
    }

}

