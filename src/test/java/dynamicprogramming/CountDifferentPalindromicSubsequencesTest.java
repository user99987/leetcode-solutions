package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CountDifferentPalindromicSubsequencesTest {

    @Test
    public void testCase1() {
        assertThat(new CountDifferentPalindromicSubsequences().countPalindromicSubsequences("bccb")).isEqualTo(6);
    }

    @Test
    public void testCase2() {
        assertThat(new CountDifferentPalindromicSubsequences().countPalindromicSubsequences(
                "abcdabcdabcdabcdabcdabcdabcdabcddcbadcbadcbadcbadcbadcbadcbadcba")).isEqualTo(104860361);
    }
}
