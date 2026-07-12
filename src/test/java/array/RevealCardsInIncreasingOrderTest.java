package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class RevealCardsInIncreasingOrderTest {

    @Test
    public void testCase1() {
        assertThat(new RevealCardsInIncreasingOrder().deckRevealedIncreasing(new int[]{17, 13, 11, 2, 3, 5, 7})).containsExactly(new int[]{2, 13, 3, 11, 5, 17, 7});
    }

    @Test
    public void testCase2() {
        assertThat(new RevealCardsInIncreasingOrder().deckRevealedIncreasing(new int[]{1, 1000})).containsExactly(new int[]{1, 1000});
    }
}
