package bitmanipulation;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HammingDistanceTest {

    @Test
    public void shouldCalculateDistanceBetweenOneAndFour() {
        assertThat(new HammingDistance().hammingDistance(1, 4)).isEqualTo(2);
    }

    @Test
    public void shouldCalculateDistanceBetweenThreeAndOne() {
        assertThat(new HammingDistance().hammingDistance(3, 1)).isEqualTo(1);
    }

    @Test
    public void shouldReturnZeroForIdenticalNumbers() {
        assertThat(new HammingDistance().hammingDistance(5, 5)).isZero();
    }

    @Test
    public void shouldReturnBitCountOfMaxValueWhenComparedWithZero() {
        assertThat(new HammingDistance().hammingDistance(0, Integer.MAX_VALUE)).isEqualTo(31);
    }

    @Test
    public void shouldReturnZeroWhenBothAreZero() {
        assertThat(new HammingDistance().hammingDistance(0, 0)).isZero();
    }

    @Test
    public void shouldReturnThirtyTwoWhenAllBitsAreOpposite() {
        assertThat(new HammingDistance().hammingDistance(0, -1)).isEqualTo(32);
    }
}
