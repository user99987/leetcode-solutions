package bitmanipulation;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TotalHammingDistanceTest {

    @Test
    public void shouldSumHammingDistancesForThreeNumbers() {
        assertThat(new TotalHammingDistance().totalHammingDistance(new int[]{4, 14, 2})).isEqualTo(6);
    }

    @Test
    public void shouldSumHammingDistancesWithDuplicateValue() {
        assertThat(new TotalHammingDistance().totalHammingDistance(new int[]{4, 14, 4})).isEqualTo(4);
    }

    @Test
    public void shouldReturnZeroForSingleElement() {
        assertThat(new TotalHammingDistance().totalHammingDistance(new int[]{7})).isZero();
    }

    @Test
    public void shouldReturnZeroWhenAllElementsAreIdentical() {
        assertThat(new TotalHammingDistance().totalHammingDistance(new int[]{9, 9, 9, 9})).isZero();
    }

    @Test
    public void shouldReturnZeroWhenAllElementsAreZero() {
        assertThat(new TotalHammingDistance().totalHammingDistance(new int[]{0, 0, 0})).isZero();
    }

    @Test
    public void shouldReturnThirtyTwoForZeroAndNegativeOnePair() {
        assertThat(new TotalHammingDistance().totalHammingDistance(new int[]{0, -1})).isEqualTo(32);
    }
}
