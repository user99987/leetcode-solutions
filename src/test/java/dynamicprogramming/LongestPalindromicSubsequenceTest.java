package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LongestPalindromicSubsequenceTest {

    @Test
    public void shouldFindLongestPalindromicSubsequenceWithRepeatedLetter() {
        assertThat(new LongestPalindromicSubsequence().longestPalindromeSubseq("bbbab")).isEqualTo(4);
    }

    @Test
    public void shouldFindLongestPalindromicSubsequenceForShortString() {
        assertThat(new LongestPalindromicSubsequence().longestPalindromeSubseq("cbbd")).isEqualTo(2);
    }
}

