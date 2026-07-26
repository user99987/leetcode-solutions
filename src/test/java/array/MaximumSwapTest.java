package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaximumSwapTest {

    @Test
    public void shouldSwapDigitsToMaximizeNumber() {
        assertThat(new MaximumSwap().maximumSwap(2736)).isEqualTo(7236);
    }

    @Test
    public void shouldNotSwapWhenAlreadyMaximal() {
        assertThat(new MaximumSwap().maximumSwap(9973)).isEqualTo(9973);
    }

    @Test
    public void shouldReturnSameNumberForSingleDigit() {
        assertThat(new MaximumSwap().maximumSwap(5)).isEqualTo(5);
    }

    @Test
    public void shouldReturnZeroForZeroInput() {
        assertThat(new MaximumSwap().maximumSwap(0)).isEqualTo(0);
    }

    @Test
    public void shouldNotSwapWhenAlreadySortedDescending() {
        assertThat(new MaximumSwap().maximumSwap(98765)).isEqualTo(98765);
    }

    @Test
    public void shouldPickLastOccurrenceWhenMaxDigitIsAmbiguous() {
        // swapping the first '1' with the last '9' gives the largest number
        assertThat(new MaximumSwap().maximumSwap(1993)).isEqualTo(9913);
    }

    @Test
    public void shouldNotChangeNumberWhenAllDigitsAreSame() {
        assertThat(new MaximumSwap().maximumSwap(1111)).isEqualTo(1111);
    }
}
