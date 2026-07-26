package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LargestMultipleOfThreeTest {

    @Test
    public void shouldFormLargestMultipleUsingAllDigits() {
        assertThat(new LargestMultipleOfThree().largestMultipleOfThree(new int[]{8, 1, 9})).isEqualTo("981");
    }

    @Test
    public void shouldDropSmallestDigitToFormMultipleOfThree() {
        assertThat(new LargestMultipleOfThree().largestMultipleOfThree(new int[]{8, 6, 7, 1, 0})).isEqualTo("8760");
    }

    @Test
    public void shouldReturnEmptyStringWhenNoMultipleOfThreeExists() {
        assertThat(new LargestMultipleOfThree().largestMultipleOfThree(new int[]{1})).isEqualTo("");
    }
}
