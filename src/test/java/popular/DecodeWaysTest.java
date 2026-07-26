package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DecodeWaysTest {

    @Test
    public void shouldDecodeTwoDigitString() {
        assertThat(new DecodeWays().numDecodings("12")).isEqualTo(2);
    }

    @Test
    public void shouldDecodeStringWithThreeWaysGrouping() {
        assertThat(new DecodeWays().numDecodings("226")).isEqualTo(3);
    }

    @Test
    public void shouldReturnZeroWhenStringStartsWithZero() {
        assertThat(new DecodeWays().numDecodings("0")).isEqualTo(0);
    }

    @Test
    public void shouldReturnZeroWhenLeadingZeroCannotBeGrouped() {
        assertThat(new DecodeWays().numDecodings("06")).isEqualTo(0);
    }
}
