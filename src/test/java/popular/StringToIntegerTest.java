package popular;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class StringToIntegerTest {

    @Test
    public void testCase1() {
        assertThat(new StringToInteger().myAtoi("42")).isEqualTo(42);
    }

    @Test
    public void testCase2() {
        assertThat(new StringToInteger().myAtoi("   -42")).isEqualTo(-42);
    }

    @Test
    public void testCase3() {
        assertThat(new StringToInteger().myAtoi("4193 with words")).isEqualTo(4193);
    }

    @Test
    public void testCase4() {
        assertThat(new StringToInteger().myAtoi("words and 987")).isEqualTo(0);
    }

    @Test
    public void testCase5() {
        assertThat(new StringToInteger().myAtoi("-91283472332")).isEqualTo(-2147483648);
    }
}
