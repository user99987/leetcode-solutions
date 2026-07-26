package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PalindromicSubstringsTest {

    @Test
    public void shouldCountOnlySingleCharacterPalindromes() {
        assertThat(new PalindromicSubstrings().countSubstrings("abc")).isEqualTo(3);
    }

    @Test
    public void shouldCountAllPalindromesForRepeatedCharacter() {
        assertThat(new PalindromicSubstrings().countSubstrings("aaa")).isEqualTo(6);
    }

    @Test
    public void shouldReturnOneForSingleCharacterString() {
        assertThat(new PalindromicSubstrings().countSubstrings("a")).isEqualTo(1);
    }

    @Test
    public void shouldReturnZeroForEmptyString() {
        assertThat(new PalindromicSubstrings().countSubstrings("")).isEqualTo(0);
    }

}
