package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class ImplementStrStrTest {

    @Test
    public void testCase1() {
        assertThat(new ImplementStrStr().strStr("hello", "ll")).isEqualTo(2);
    }

    @Test
    public void testCase2() {
        assertThat(new ImplementStrStr().strStr("aaaaa", "bba")).isEqualTo(-1);
    }

    @Test
    public void testCase3() {
        assertThat(new ImplementStrStr().strStr("", "")).isEqualTo(0);
    }
}
