package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LongestIncreasingSubsequenceTest {

    @Test
    public void shouldFindLongestIncreasingSubsequenceForMixedArray() {
        assertThat(new LongestIncreasingSubsequence().lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18})).isEqualTo(4);
    }

    @Test
    public void shouldFindLongestIncreasingSubsequenceWithDuplicates() {
        assertThat(new LongestIncreasingSubsequence().lengthOfLIS(new int[]{0, 1, 0, 3, 2, 3})).isEqualTo(4);
    }

    @Test
    public void shouldReturnOneWhenAllElementsAreEqual() {
        assertThat(new LongestIncreasingSubsequence().lengthOfLIS(new int[]{7, 7, 7, 7, 7})).isEqualTo(1);
    }
}
