package string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MultiplyStringsTest {

    @Test
    void testCase1() {
        String num1 = "2";
        String num2 = "3";
        String expected = "6";
        assertEquals(expected, new MultiplyStrings().multiply(num1, num2));
    }

    @Test
    void testCase2() {
        String num1 = "123";
        String num2 = "456";
        String expected = "56088";
        assertEquals(expected, new MultiplyStrings().multiply(num1, num2));
    }
}
