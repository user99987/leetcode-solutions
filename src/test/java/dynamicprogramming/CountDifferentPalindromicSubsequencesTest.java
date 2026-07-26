package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CountDifferentPalindromicSubsequencesTest {

    @Test
    public void shouldCountDistinctPalindromicSubsequencesForShortString() {
        assertThat(new CountDifferentPalindromicSubsequences().countPalindromicSubsequences("bccb")).isEqualTo(6);
    }

    @Test
    public void shouldCountDistinctPalindromicSubsequencesModuloForLongString() {
        assertThat(new CountDifferentPalindromicSubsequences().countPalindromicSubsequences(
                "abcdabcdabcdabcdabcdabcdabcdabcddcbadcbadcbadcbadcbadcbadcbadcba")).isEqualTo(104860361);
    }
}
