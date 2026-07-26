package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class LargestNumberTest {

    @Test
    public void shouldArrangeTwoNumbersForLargestResult() {
        assertThat(new LargestNumber().largestNumber(new int[]{10, 2})).isEqualTo("210");
    }

    @Test
    public void shouldArrangeMultipleNumbersForLargestResult() {
        assertThat(new LargestNumber().largestNumber(new int[]{3, 30, 34, 5, 9})).isEqualTo("9534330");
    }

    @Test
    public void shouldReturnSameNumberForSingleElement() {
        assertThat(new LargestNumber().largestNumber(new int[]{1})).isEqualTo("1");
    }

    @Test
    public void shouldReturnSameNumberForSingleMultiDigitElement() {
        assertThat(new LargestNumber().largestNumber(new int[]{10})).isEqualTo("10");
    }
}
