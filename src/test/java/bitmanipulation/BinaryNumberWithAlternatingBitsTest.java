package bitmanipulation;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class BinaryNumberWithAlternatingBitsTest {

    @Test
    public void shouldReturnTrueForAlternatingBits() {
        assertThat(new BinaryNumberWithAlternatingBits().hasAlternatingBits(5)).isTrue();
    }

    @Test
    public void shouldReturnFalseForConsecutiveOnes() {
        assertThat(new BinaryNumberWithAlternatingBits().hasAlternatingBits(7)).isFalse();
    }

    @Test
    public void shouldReturnFalseForNonAlternatingPattern() {
        assertThat(new BinaryNumberWithAlternatingBits().hasAlternatingBits(11)).isFalse();
    }

    @Test
    public void shouldReturnTrueForOne() {
        assertThat(new BinaryNumberWithAlternatingBits().hasAlternatingBits(1)).isTrue();
    }

    @Test
    public void shouldReturnTrueForTwo() {
        assertThat(new BinaryNumberWithAlternatingBits().hasAlternatingBits(2)).isTrue();
    }

    @Test
    public void shouldReturnFalseForMaxIntValue() {
        assertThat(new BinaryNumberWithAlternatingBits().hasAlternatingBits(Integer.MAX_VALUE)).isFalse();
    }

    @Test
    public void shouldReturnTrueForLargestAlternatingPattern() {
        // 0b1010101010101010101010101010101 (31 bits alternating, fits within positive int)
        assertThat(new BinaryNumberWithAlternatingBits().hasAlternatingBits(0x55555555)).isTrue();
    }

    @Test
    public void shouldReturnFalseWhenThreeConsecutiveZeroBitsExist() {
        // 4 = 100b has two adjacent zero bits, so it is not alternating
        assertThat(new BinaryNumberWithAlternatingBits().hasAlternatingBits(4)).isFalse();
    }
}
