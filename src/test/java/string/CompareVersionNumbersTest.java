package string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CompareVersionNumbersTest {

    @Test
    public void testCase1() {
        assertThat(new CompareVersionNumbers().compareVersion("1.01", "1.001")).isEqualTo(0);
    }

    @Test
    public void testCase2() {
        assertThat(new CompareVersionNumbers().compareVersion("1.0", "1.0.0")).isEqualTo(0);
    }

    @Test
    public void testCase3() {
        assertThat(new CompareVersionNumbers().compareVersion("0.1", "1.1")).isEqualTo(-1);
    }

    @Test
    public void testCase4() {
        assertThat(new CompareVersionNumbers().compareVersion("1.2", "1.1")).isEqualTo(1);
    }

}
