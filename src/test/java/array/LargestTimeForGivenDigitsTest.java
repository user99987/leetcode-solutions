package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class LargestTimeForGivenDigitsTest {

    @Test
    public void testCase1() {
        assertThat(new LargestTimeForGivenDigits().largestTimeFromDigits(new int[]{1, 2, 3, 4})).isEqualTo("23:41");
    }

    @Test
    public void testCase2() {
        assertThat(new LargestTimeForGivenDigits().largestTimeFromDigits(new int[]{5, 5, 5, 5})).isEqualTo("");
    }
}
