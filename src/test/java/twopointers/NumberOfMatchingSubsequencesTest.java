package twopointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberOfMatchingSubsequencesTest {

    @Test
    public void testCase1() {
        int actual = new NumberOfMatchingSubsequences().numMatchingSubseq(
                "abcde",
                new String[]{"a", "bb", "acd", "ace"}
        );
        var expected = 3;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testCase2() {
        int actual = new NumberOfMatchingSubsequences().numMatchingSubseq(
                "dsahjpjauf",
                new String[]{"ahjpjau", "ja", "ahbwzgqnuk", "tnmlanowax"}
        );
        var expected = 2;
        assertThat(actual).isEqualTo(expected);
    }
}
