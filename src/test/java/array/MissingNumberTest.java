package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MissingNumberTest {

    @Test
    public void shouldFindMissingNumberInMiddleOfRange() {
        assertThat(new MissingNumber().missingNumber(new int[]{3, 0, 1})).isEqualTo(2);
    }

    @Test
    public void shouldFindMissingNumberInLargerRange() {
        assertThat(new MissingNumber().missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1})).isEqualTo(8);
    }

    @Test
    public void shouldReturnOneWhenOnlyZeroPresent() {
        assertThat(new MissingNumber().missingNumber(new int[]{0})).isEqualTo(1);
    }

    @Test
    public void shouldReturnZeroWhenMissingNumberIsZero() {
        assertThat(new MissingNumber().missingNumber(new int[]{1, 2, 3})).isEqualTo(0);
    }

    @Test
    public void shouldReturnNWhenMissingNumberIsN() {
        assertThat(new MissingNumber().missingNumber(new int[]{0, 1, 2})).isEqualTo(3);
    }

    @Test
    public void shouldReturnZeroForSingleElementArrayMissingZero() {
        assertThat(new MissingNumber().missingNumber(new int[]{1})).isEqualTo(0);
    }
}
