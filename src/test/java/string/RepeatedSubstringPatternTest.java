package string;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepeatedSubstringPatternTest {

    @Test
    public void testCase1() {
        String a = "abcd";
        String b = "cdabcdab";
        int expected = 3;
        assertEquals(expected, new RepeatedSubstringPattern().repeatedStringMatch(a, b));
    }

    @Test
    public void testCase2() {
        String a = "a";
        String b = "aa";
        int expected = 2;
        assertEquals(expected, new RepeatedSubstringPattern().repeatedStringMatch(a, b));
    }
}
