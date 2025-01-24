package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RevealCardsInIncreasingOrderTest {

    @Test
    public void testCase1() {
        assertArrayEquals(new int[]{2, 13, 3, 11, 5, 17, 7},
                new RevealCardsInIncreasingOrder().deckRevealedIncreasing(new int[]{17, 13, 11, 2, 3, 5, 7}));
    }

    @Test
    public void testCase2() {
        assertArrayEquals(new int[]{1, 1000},
                new RevealCardsInIncreasingOrder().deckRevealedIncreasing(new int[]{1, 1000}));
    }
}
