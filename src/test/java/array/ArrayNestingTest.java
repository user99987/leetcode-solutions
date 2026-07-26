package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ArrayNestingTest {

    @Test
    public void shouldFindLongestCycleInPermutation() {
        assertThat(new ArrayNesting().arrayNesting(new int[]{5, 4, 0, 3, 1, 6, 2})).isEqualTo(4);
    }

    @Test
    public void shouldFindShortestCycleAtStart() {
        assertThat(new ArrayNesting().arrayNesting(new int[]{0, 1, 2})).isEqualTo(1);
    }

    @Test
    public void shouldReturnOneForSingleElementArray() {
        assertThat(new ArrayNesting().arrayNesting(new int[]{0})).isEqualTo(1);
    }

    @Test
    public void shouldReturnFullLengthWhenAllElementsFormOneCycle() {
        assertThat(new ArrayNesting().arrayNesting(new int[]{1, 2, 3, 4, 0})).isEqualTo(5);
    }

    @Test
    public void shouldReturnSmallestCommonLengthForMultipleSmallCycles() {
        // Two disjoint 2-cycles: (0 1) and (2 3)
        assertThat(new ArrayNesting().arrayNesting(new int[]{1, 0, 3, 2})).isEqualTo(2);
    }

    @Test
    public void shouldReturnOneForIdentityPermutation() {
        assertThat(new ArrayNesting().arrayNesting(new int[]{0, 1, 2, 3, 4})).isEqualTo(1);
    }
}
