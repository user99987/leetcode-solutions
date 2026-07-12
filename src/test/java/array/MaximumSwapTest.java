package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaximumSwapTest {

    @Test
    public void testCase1() {
        assertThat(new MaximumSwap().maximumSwap(2736)).isEqualTo(7236);
    }

    @Test
    public void testCase2() {
        assertThat(new MaximumSwap().maximumSwap(9973)).isEqualTo(9973);
    }
}
