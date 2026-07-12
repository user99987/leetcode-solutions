package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MinimumCostToMergeStonesTest {

    @Test
    public void testCase1() {
        assertThat(new MinimumCostToMergeStones().mergeStones(new int[]{3, 2, 4, 1}, 2)).isEqualTo(20);
    }

    @Test
    public void testCase2() {
        assertThat(new MinimumCostToMergeStones().mergeStones(new int[]{3, 2, 4, 1}, 3)).isEqualTo(-1);
    }

    @Test
    public void testCase3() {
        assertThat(new MinimumCostToMergeStones().mergeStones(new int[]{3, 5, 1, 2, 6}, 3)).isEqualTo(25);
    }
}
