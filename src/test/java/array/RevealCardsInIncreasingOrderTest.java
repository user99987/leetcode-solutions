package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class RevealCardsInIncreasingOrderTest {

    @Test
    public void shouldOrderDeckForSevenCards() {
        assertThat(new RevealCardsInIncreasingOrder().deckRevealedIncreasing(new int[]{17, 13, 11, 2, 3, 5, 7})).containsExactly(new int[]{2, 13, 3, 11, 5, 17, 7});
    }

    @Test
    public void shouldOrderDeckForTwoCards() {
        assertThat(new RevealCardsInIncreasingOrder().deckRevealedIncreasing(new int[]{1, 1000})).containsExactly(new int[]{1, 1000});
    }

    @Test
    public void shouldReturnSameCardForSingleCardDeck() {
        assertThat(new RevealCardsInIncreasingOrder().deckRevealedIncreasing(new int[]{7})).containsExactly(new int[]{7});
    }

    @Test
    public void shouldOrderDeckCorrectlyForThreeCards() {
        assertThat(new RevealCardsInIncreasingOrder().deckRevealedIncreasing(new int[]{3, 1, 2})).containsExactly(new int[]{1, 3, 2});
    }

    @Test
    public void shouldProduceValidOrderingForAlreadySortedDeck() {
        assertThat(new RevealCardsInIncreasingOrder().deckRevealedIncreasing(new int[]{1, 2, 3, 4})).containsExactly(new int[]{1, 3, 2, 4});
    }
}
