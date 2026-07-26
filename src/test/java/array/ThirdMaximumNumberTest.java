package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ThirdMaximumNumberTest {

    @Test
    public void shouldFindThirdMaximumInDistinctArray() {
        assertThat(new ThirdMaximumNumber().thirdMax(new int[]{3, 2, 1})).isEqualTo(1);
    }

    @Test
    public void shouldReturnMaxWhenOnlyTwoElements() {
        assertThat(new ThirdMaximumNumber().thirdMax(new int[]{1, 2})).isEqualTo(2);
    }

    @Test
    public void shouldFindThirdMaximumIgnoringDuplicates() {
        assertThat(new ThirdMaximumNumber().thirdMax(new int[]{2, 2, 3, 1})).isEqualTo(1);
    }

    @Test
    public void shouldReturnThatElementForSingleElementArray() {
        assertThat(new ThirdMaximumNumber().thirdMax(new int[]{7})).isEqualTo(7);
    }

    @Test
    public void shouldReturnMaxWhenAllElementsAreDuplicates() {
        assertThat(new ThirdMaximumNumber().thirdMax(new int[]{5, 5, 5})).isEqualTo(5);
    }

    @Test
    public void shouldHandleNegativeNumbersCorrectly() {
        assertThat(new ThirdMaximumNumber().thirdMax(new int[]{-3, -2, -1})).isEqualTo(-3);
    }

    @Test
    public void shouldAvoidOverflowWithIntegerMinValue() {
        assertThat(new ThirdMaximumNumber().thirdMax(new int[]{Integer.MIN_VALUE, 1, 2})).isEqualTo(Integer.MIN_VALUE);
    }

    @Test
    public void shouldReturnMaxWhenExactlyTwoDistinctValues() {
        assertThat(new ThirdMaximumNumber().thirdMax(new int[]{1, 1, 2, 2})).isEqualTo(2);
    }
}
