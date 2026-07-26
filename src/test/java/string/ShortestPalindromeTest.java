package string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ShortestPalindromeTest {

    @Test
    void shouldPrependMinimalCharactersForNearPalindrome() {
        assertThat(new ShortestPalindrome().shortestPalindrome("aacecaaa")).isEqualTo("aaacecaaa");
    }

    @Test
    void shouldPrependReversedSuffixForNonPalindrome() {
        assertThat(new ShortestPalindrome().shortestPalindrome("abcd")).isEqualTo("dcbabcd");
    }

    @Test
    void shouldReturnSameStringForSingleCharacter() {
        assertThat(new ShortestPalindrome().shortestPalindrome("a")).isEqualTo("a");
    }

    @Test
    void shouldReturnEmptyStringForEmptyInput() {
        assertThat(new ShortestPalindrome().shortestPalindrome("")).isEqualTo("");
    }
}
