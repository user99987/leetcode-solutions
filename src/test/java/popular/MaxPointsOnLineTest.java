package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class MaxPointsOnLineTest {

    @Test
    public void shouldCountPointsOnSameDiagonalLine() {
        assertThat(new MaxPointsOnLine().maxPoints(new int[][]{{1, 1}, {2, 2}, {3, 3}})).isEqualTo(3);
    }

    @Test
    public void shouldFindMaximumPointsOnLineAmongScatteredPoints() {
        assertThat(new MaxPointsOnLine().maxPoints(new int[][]{{1, 1}, {3, 2}, {5, 3}, {4, 1}, {2, 3}, {1, 4}})).isEqualTo(4);
    }
}
