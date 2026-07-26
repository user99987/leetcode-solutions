package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InterleavingStringTest {

    @Test
    public void shouldReturnTrueWhenStringIsValidInterleaving() {
        assertThat(new InterleavingString().isInterleave("aabcc", "dbbca", "aadbbcbcac")).isTrue();
    }

    @Test
    public void shouldReturnFalseWhenStringIsNotValidInterleaving() {
        assertThat(new InterleavingString().isInterleave("aabcc", "dbbca", "aadbbbaccc")).isFalse();
    }

    @Test
    public void shouldReturnTrueForAllEmptyStrings() {
        assertThat(new InterleavingString().isInterleave("", "", "")).isTrue();
    }
}
