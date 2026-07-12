package string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RepeatedSubstringPatternTest {

    @Test
    public void testCase1() {
        var a = "abcd";
        var b = "cdabcdab";
        var expected = 3;
        assertThat(new RepeatedSubstringPattern().repeatedStringMatch(a, b)).isEqualTo(expected);
    }

    @Test
    public void testCase2() {
        var a = "a";
        var b = "aa";
        var expected = 2;
        assertThat(new RepeatedSubstringPattern().repeatedStringMatch(a, b)).isEqualTo(expected);
    }
}
