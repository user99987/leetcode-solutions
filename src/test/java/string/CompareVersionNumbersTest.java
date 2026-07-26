package string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CompareVersionNumbersTest {

    @Test
    public void shouldTreatDifferentLeadingZerosAsEqual() {
        assertThat(new CompareVersionNumbers().compareVersion("1.01", "1.001")).isEqualTo(0);
    }

    @Test
    public void shouldTreatMissingRevisionAsZero() {
        assertThat(new CompareVersionNumbers().compareVersion("1.0", "1.0.0")).isEqualTo(0);
    }

    @Test
    public void shouldReturnNegativeOneWhenFirstVersionIsSmaller() {
        assertThat(new CompareVersionNumbers().compareVersion("0.1", "1.1")).isEqualTo(-1);
    }

    @Test
    public void shouldReturnOneWhenFirstVersionIsLarger() {
        assertThat(new CompareVersionNumbers().compareVersion("1.2", "1.1")).isEqualTo(1);
    }

}
