package twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LastSubstringInLexicographicalOrderTest {

    @Test
    public void testCase1() {
        String actual = new LastSubstringInLexicographicalOrder().lastSubstring("abab");
        String expected = "bab";
        assertEquals(expected, actual);
    }

    @Test
    public void testCase2() {
        String actual = new LastSubstringInLexicographicalOrder().lastSubstring("leetcode");
        String expected = "tcode";
        assertEquals(expected, actual);
    }
}
