package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class LargestTimeForGivenDigitsTest {

    @Test
    public void shouldFindLargestValidTimeFromFourDigits() {
        assertThat(new LargestTimeForGivenDigits().largestTimeFromDigits(new int[]{1, 2, 3, 4})).isEqualTo("23:41");
    }

    @Test
    public void shouldReturnEmptyStringWhenNoValidTimeExists() {
        assertThat(new LargestTimeForGivenDigits().largestTimeFromDigits(new int[]{5, 5, 5, 5})).isEqualTo("");
    }

    @Test
    public void shouldReturnMidnightWhenAllDigitsAreZero() {
        assertThat(new LargestTimeForGivenDigits().largestTimeFromDigits(new int[]{0, 0, 0, 0})).isEqualTo("00:00");
    }

    @Test
    public void shouldReturnLatestPossibleTime() {
        assertThat(new LargestTimeForGivenDigits().largestTimeFromDigits(new int[]{2, 3, 5, 9})).isEqualTo("23:59");
    }

    @Test
    public void shouldReturnOnlyValidArrangementAvailable() {
        assertThat(new LargestTimeForGivenDigits().largestTimeFromDigits(new int[]{0, 0, 0, 9})).isEqualTo("09:00");
    }

    @Test
    public void shouldReturnLargestValidTimeWithRepeatingDigits() {
        assertThat(new LargestTimeForGivenDigits().largestTimeFromDigits(new int[]{0, 4, 0, 0})).isEqualTo("04:00");
    }
}
