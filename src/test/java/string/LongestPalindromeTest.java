package string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongestPalindromeTest {

    @Test
    void shouldBuildLongestPalindromeFromMixedFrequencies() {
        assertThat(new LongestPalindrome().longestPalindrome("abccccdd")).isEqualTo(7);
    }

    @Test
    void shouldReturnOneForSingleCharacter() {
        assertThat(new LongestPalindrome().longestPalindrome("a")).isEqualTo(1);
    }

    @Test
    void shouldReturnTwoForMatchingPair() {
        assertThat(new LongestPalindrome().longestPalindrome("bb")).isEqualTo(2);
    }
}
