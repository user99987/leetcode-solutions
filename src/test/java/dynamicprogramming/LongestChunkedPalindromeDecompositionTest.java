package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LongestChunkedPalindromeDecompositionTest {

    @Test
    public void shouldFindSevenChunksForNestedPalindromicString() {
        assertThat(new LongestChunkedPalindromeDecomposition().longestDecomposition("ghiabcdefhelloadamhelloabcdefghi")).isEqualTo(7);
    }

    @Test
    public void shouldReturnOneWhenStringHasNoRepeatingChunks() {
        assertThat(new LongestChunkedPalindromeDecomposition().longestDecomposition("merchant")).isEqualTo(1);
    }

    @Test
    public void shouldFindElevenChunksForComplexPalindromicString() {
        assertThat(new LongestChunkedPalindromeDecomposition().longestDecomposition("antaprezatepzapreanta")).isEqualTo(11);
    }
}

