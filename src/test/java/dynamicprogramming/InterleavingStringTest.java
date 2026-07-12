package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InterleavingStringTest {

    @Test
    public void testCase1() {
        assertThat(new InterleavingString().isInterleave("aabcc", "dbbca", "aadbbcbcac")).isTrue();
    }

    @Test
    public void testCase2() {
        assertThat(new InterleavingString().isInterleave("aabcc", "dbbca", "aadbbbaccc")).isFalse();
    }

    @Test
    public void testCase3() {
        assertThat(new InterleavingString().isInterleave("", "", "")).isTrue();
    }
}
