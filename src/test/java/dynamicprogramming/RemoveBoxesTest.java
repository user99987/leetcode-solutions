package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RemoveBoxesTest {

    @Test
    public void shouldMaximizePointsWithMixedGroupedBoxes() {
        assertThat(new RemoveBoxes().removeBoxes(new int[]{1, 3, 2, 2, 2, 3, 4, 3, 1})).isEqualTo(23);
    }

    @Test
    public void shouldMaximizePointsForAllIdenticalBoxes() {
        assertThat(new RemoveBoxes().removeBoxes(new int[]{1, 1, 1})).isEqualTo(9);
    }

    @Test
    public void shouldReturnOneForSingleBox() {
        assertThat(new RemoveBoxes().removeBoxes(new int[]{1})).isEqualTo(1);
    }

    @Test
    public void shouldReturnZeroForEmptyArray() {
        assertThat(new RemoveBoxes().removeBoxes(new int[]{})).isEqualTo(0);
    }
}
