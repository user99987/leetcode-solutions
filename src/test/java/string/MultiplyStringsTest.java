package string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MultiplyStringsTest {

    @Test
    void testCase1() {
        var num1 = "2";
        var num2 = "3";
        var expected = "6";
        assertThat(new MultiplyStrings().multiply(num1, num2)).isEqualTo(expected);
    }

    @Test
    void testCase2() {
        var num1 = "123";
        var num2 = "456";
        var expected = "56088";
        assertThat(new MultiplyStrings().multiply(num1, num2)).isEqualTo(expected);
    }
}
