package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LongestChunkedPalindromeDecompositionTest {

    @Test
    public void testCase1() {
        assertThat(new LongestChunkedPalindromeDecomposition().longestDecomposition("ghiabcdefhelloadamhelloabcdefghi")).isEqualTo(7);
    }

    @Test
    public void testCase2() {
        assertThat(new LongestChunkedPalindromeDecomposition().longestDecomposition("merchant")).isEqualTo(1);
    }

    @Test
    public void testCase3() {
        assertThat(new LongestChunkedPalindromeDecomposition().longestDecomposition("antaprezatepzapreanta")).isEqualTo(11);
    }
}

