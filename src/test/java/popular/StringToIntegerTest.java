package popular;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class StringToIntegerTest {

    @Test
    public void shouldParseSimplePositiveNumber() {
        assertThat(new StringToInteger().myAtoi("42")).isEqualTo(42);
    }

    @Test
    public void shouldParseNegativeNumberWithLeadingWhitespace() {
        assertThat(new StringToInteger().myAtoi("   -42")).isEqualTo(-42);
    }

    @Test
    public void shouldStopParsingAtFirstNonDigitCharacter() {
        assertThat(new StringToInteger().myAtoi("4193 with words")).isEqualTo(4193);
    }

    @Test
    public void shouldReturnZeroWhenNoDigitsAtStart() {
        assertThat(new StringToInteger().myAtoi("words and 987")).isEqualTo(0);
    }

    @Test
    public void shouldClampToIntegerMinValueOnOverflow() {
        assertThat(new StringToInteger().myAtoi("-91283472332")).isEqualTo(-2147483648);
    }
}
