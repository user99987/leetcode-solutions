package greedy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaximumLengthOfPairChainTest {

    @Test
    public void shouldFindLongestChainWithOverlaps() {
        assertThat(new MaximumLengthOfPairChain().findLongestChain(new int[][]{{1, 2}, {2, 3}, {3, 4}})).isEqualTo(2);
    }

    @Test
    public void shouldFindLongestChainForDisjointUnsortedPairs() {
        assertThat(new MaximumLengthOfPairChain().findLongestChain(new int[][]{{1, 2}, {7, 8}, {4, 5}})).isEqualTo(3);
    }

    @Test
    public void shouldReturnOneForSinglePair() {
        assertThat(new MaximumLengthOfPairChain().findLongestChain(new int[][]{{1, 2}})).isEqualTo(1);
    }

    @Test
    public void shouldChooseOnlyOnePairWhenAllOverlap() {
        assertThat(new MaximumLengthOfPairChain().findLongestChain(new int[][]{{1, 10}, {2, 9}, {3, 8}})).isEqualTo(1);
    }

    @Test
    public void shouldChainAllPairsWhenAllAreDisjoint() {
        assertThat(new MaximumLengthOfPairChain().findLongestChain(new int[][]{{1, 2}, {3, 4}, {5, 6}, {7, 8}})).isEqualTo(4);
    }

    @Test
    public void shouldHandleNegativeRangesCorrectly() {
        assertThat(new MaximumLengthOfPairChain().findLongestChain(new int[][]{{-10, -8}, {-7, -5}, {-6, -4}})).isEqualTo(2);
    }
}
