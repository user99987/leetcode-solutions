package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaximumSumOfTwoNonOverlappingSubArraysTest {

    @Test
    public void testCase1() {
        assertThat(new MaximumSumOfTwoNonOverlappingSubArrays().maxSumTwoNoOverlap(new int[]{0, 6, 5, 2, 2, 5, 1, 9, 4}, 1, 2)).isEqualTo(20);
    }

    @Test
    public void testCase2() {
        assertThat(new MaximumSumOfTwoNonOverlappingSubArrays().maxSumTwoNoOverlap(new int[]{3, 8, 1, 3, 2, 1, 8, 9, 0}, 3, 2)).isEqualTo(29);
    }

    @Test
    public void testCase3() {
        assertThat(new MaximumSumOfTwoNonOverlappingSubArrays().maxSumTwoNoOverlap(new int[]{2, 1, 5, 6, 0, 9, 5, 0, 3, 8}, 4, 3)).isEqualTo(31);
    }
}

