package string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ZigZagConversionTest {

    @Test
    public void shouldConvertToZigZagWithThreeRows() {
        var s = "PAYPALISHIRING";
        var numRows = 3;
        var expected = "PAHNAPLSIIGYIR";
        assertThat(new ZigZagConversion().convert(s, numRows)).isEqualTo(expected);
    }

    @Test
    public void shouldConvertToZigZagWithFourRows() {
        var s = "PAYPALISHIRING";
        var numRows = 4;
        var expected = "PINALSIGYAHRPI";
        assertThat(new ZigZagConversion().convert(s, numRows)).isEqualTo(expected);
    }

    @Test
    public void shouldReturnSameStringWhenSingleRow() {
        var s = "A";
        var numRows = 1;
        var expected = "A";
        assertThat(new ZigZagConversion().convert(s, numRows)).isEqualTo(expected);
    }
}
