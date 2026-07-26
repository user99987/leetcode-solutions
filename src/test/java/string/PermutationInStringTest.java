package string;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PermutationInStringTest {

    @Test
    void shouldReturnTrueWhenPermutationExistsAsSubstring() {
        var s1 = "ab";
        var s2 = "eidbaooo";
        assertThat(new PermutationInString().checkInclusion(s1, s2)).isTrue();
    }

    @Test
    void shouldReturnFalseWhenNoPermutationExists() {
        var s1 = "ab";
        var s2 = "eidboaoo";
        assertThat(new PermutationInString().checkInclusion(s1, s2)).isFalse();
    }

    @Test
    void shouldReturnTrueWhenPermutationFoundAtEndOfLongerString() {
        var s1 = "abc";
        var s2 = "ccccbabaaaa";
        assertThat(new PermutationInString().checkInclusion(s1, s2)).isTrue();
    }

    @Test
    void shouldReturnFalseWhenStringsShareNoCharacters() {
        var s1 = "abcd";
        var s2 = "efgh";
        assertThat(new PermutationInString().checkInclusion(s1, s2)).isFalse();
    }

    @Test
    void shouldReturnTrueForIdenticalSingleCharacterStrings() {
        var s1 = "a";
        var s2 = "a";
        assertThat(new PermutationInString().checkInclusion(s1, s2)).isTrue();
    }
}
