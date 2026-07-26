package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MinimumCostToMergeStonesTest {

    @Test
    public void shouldFindMinimumCostForMergingPairs() {
        assertThat(new MinimumCostToMergeStones().mergeStones(new int[]{3, 2, 4, 1}, 2)).isEqualTo(20);
    }

    @Test
    public void shouldReturnMinusOneWhenMergeCountIsImpossible() {
        assertThat(new MinimumCostToMergeStones().mergeStones(new int[]{3, 2, 4, 1}, 3)).isEqualTo(-1);
    }

    @Test
    public void shouldFindMinimumCostForMergingTriples() {
        assertThat(new MinimumCostToMergeStones().mergeStones(new int[]{3, 5, 1, 2, 6}, 3)).isEqualTo(25);
    }
}
