package popular;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class NumberOf1BitsTest {

    @Test
    public void shouldCountThreeSetBits() {
        assertThat(new NumberOf1Bits().hammingWeight(0b00000000000000000000000000001011)).isEqualTo(3);
    }

    @Test
    public void shouldCountSingleSetBit() {
        assertThat(new NumberOf1Bits().hammingWeight(0b00000000000000000000000010000000)).isEqualTo(1);
    }

    @Test
    public void shouldCountManySetBitsInLargeNumber() {
        assertThat(new NumberOf1Bits().hammingWeight(0b11111111111111111111111111111101)).isEqualTo(31);
    }
}
