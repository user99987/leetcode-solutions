package greedy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ScoreAfterFlippingMatrixTest {

    @Test
    public void testCase1() {
        int[][] grid = {
                {0, 0, 1, 1},
                {1, 0, 1, 0},
                {1, 1, 0, 0}
        };
        var expected = 39;
        assertThat(new ScoreAfterFlippingMatrix().matrixScore(grid)).isEqualTo(expected);
    }

    @Test
    public void testCase2() {
        int[][] grid = {
                {0}
        };
        var expected = 1;
        assertThat(new ScoreAfterFlippingMatrix().matrixScore(grid)).isEqualTo(expected);
    }
}
