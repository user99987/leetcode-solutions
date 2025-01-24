package string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZigZagConversionTest {

    @Test
    public void testCase1() {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String expected = "PAHNAPLSIIGYIR";
        assertEquals(expected, new ZigZagConversion().convert(s, numRows));
    }

    @Test
    public void testCase2() {
        String s = "PAYPALISHIRING";
        int numRows = 4;
        String expected = "PINALSIGYAHRPI";
        assertEquals(expected, new ZigZagConversion().convert(s, numRows));
    }

    @Test
    public void testCase3() {
        String s = "A";
        int numRows = 1;
        String expected = "A";
        assertEquals(expected, new ZigZagConversion().convert(s, numRows));
    }
}
