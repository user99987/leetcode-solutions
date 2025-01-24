package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestChunkedPalindromeDecompositionTest {

    @Test
    public void testCase1() {
        assertEquals(7, new LongestChunkedPalindromeDecomposition().longestDecomposition("ghiabcdefhelloadamhelloabcdefghi"));
    }

    @Test
    public void testCase2() {
        assertEquals(1, new LongestChunkedPalindromeDecomposition().longestDecomposition("merchant"));
    }

    @Test
    public void testCase3() {
        assertEquals(11, new LongestChunkedPalindromeDecomposition().longestDecomposition("antaprezatepzapreanta"));
    }
}

