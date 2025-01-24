package twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfMatchingSubsequencesTest {

    @Test
    public void testCase1() {
        int actual = new NumberOfMatchingSubsequences().numMatchingSubseq(
                "abcde",
                new String[]{"a", "bb", "acd", "ace"}
        );
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void testCase2() {
        int actual = new NumberOfMatchingSubsequences().numMatchingSubseq(
                "dsahjpjauf",
                new String[]{"ahjpjau", "ja", "ahbwzgqnuk", "tnmlanowax"}
        );
        int expected = 2;
        assertEquals(expected, actual);
    }
}
