package greedy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaximumLengthOfPairChainTest {

    @Test
    public void testCase1() {
        assertThat(new MaximumLengthOfPairChain().findLongestChain(new int[][]{{1, 2}, {2, 3}, {3, 4}})).isEqualTo(2);
    }

    @Test
    public void testCase2() {
        assertThat(new MaximumLengthOfPairChain().findLongestChain(new int[][]{{1, 2}, {7, 8}, {4, 5}})).isEqualTo(3);
    }
}
