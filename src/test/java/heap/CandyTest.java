package heap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CandyTest {

    @Test
    public void shouldCalculateMinimumCandiesForValleyPattern() {
        assertThat(new Candy().candy(new int[]{1, 0, 2})).isEqualTo(5);
    }

    @Test
    public void shouldCalculateMinimumCandiesForIncreasingThenFlatPattern() {
        assertThat(new Candy().candy(new int[]{1, 2, 2})).isEqualTo(4);
    }

    @Test
    public void shouldGiveOneCandyToSingleChild() {
        assertThat(new Candy().candy(new int[]{5})).isEqualTo(1);
    }

    @Test
    public void shouldGiveOneCandyEachWhenAllRatingsAreEqual() {
        assertThat(new Candy().candy(new int[]{3, 3, 3, 3})).isEqualTo(4);
    }

    @Test
    public void shouldCalculateTriangularSumForStrictlyIncreasingRatings() {
        assertThat(new Candy().candy(new int[]{1, 2, 3, 4, 5})).isEqualTo(15);
    }

    @Test
    public void shouldCalculateTriangularSumForStrictlyDecreasingRatings() {
        assertThat(new Candy().candy(new int[]{5, 4, 3, 2, 1})).isEqualTo(15);
    }

    @Test
    public void shouldCalculateCorrectDistributionForPeakInMiddle() {
        assertThat(new Candy().candy(new int[]{1, 2, 3, 2, 1})).isEqualTo(9);
    }

    @Test
    public void shouldCalculateCorrectDistributionForValleyInMiddle() {
        assertThat(new Candy().candy(new int[]{3, 2, 1, 2, 3})).isEqualTo(11);
    }
}
