package string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ZigZagConversionTest {

    @Test
    public void testCase1() {
        var s = "PAYPALISHIRING";
        var numRows = 3;
        var expected = "PAHNAPLSIIGYIR";
        assertThat(new ZigZagConversion().convert(s, numRows)).isEqualTo(expected);
    }

    @Test
    public void testCase2() {
        var s = "PAYPALISHIRING";
        var numRows = 4;
        var expected = "PINALSIGYAHRPI";
        assertThat(new ZigZagConversion().convert(s, numRows)).isEqualTo(expected);
    }

    @Test
    public void testCase3() {
        var s = "A";
        var numRows = 1;
        var expected = "A";
        assertThat(new ZigZagConversion().convert(s, numRows)).isEqualTo(expected);
    }
}
