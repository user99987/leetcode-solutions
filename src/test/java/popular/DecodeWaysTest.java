package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DecodeWaysTest {

    @Test
    public void testCase1() {
        assertThat(new DecodeWays().numDecodings("12")).isEqualTo(2);
    }

    @Test
    public void testCase2() {
        assertThat(new DecodeWays().numDecodings("226")).isEqualTo(3);
    }

    @Test
    public void testCase3() {
        assertThat(new DecodeWays().numDecodings("0")).isEqualTo(0);
    }

    @Test
    public void testCase4() {
        assertThat(new DecodeWays().numDecodings("06")).isEqualTo(0);
    }
}
