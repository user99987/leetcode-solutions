package string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReconstructOriginalDigitsFromEnglishTest {

    @Test
    public void testCase1() {
        var input = "owoztneoer";
        var expected = "012";
        assertThat(new ReconstructOriginalDigitsFromEnglish().originalDigits(input)).isEqualTo(expected);
    }

    @Test
    public void testCase2() {
        var input = "fviefuro";
        var expected = "45";
        assertThat(new ReconstructOriginalDigitsFromEnglish().originalDigits(input)).isEqualTo(expected);
    }
}
