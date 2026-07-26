package greedy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ScoreAfterFlippingMatrixTest {

    @Test
    public void shouldMaximizeScoreForMultiRowGrid() {
        int[][] grid = {
                {0, 0, 1, 1},
                {1, 0, 1, 0},
                {1, 1, 0, 0}
        };
        var expected = 39;
        assertThat(new ScoreAfterFlippingMatrix().matrixScore(grid)).isEqualTo(expected);
    }

    @Test
    public void shouldReturnOneForSingleCellGrid() {
        int[][] grid = {
                {0}
        };
        var expected = 1;
        assertThat(new ScoreAfterFlippingMatrix().matrixScore(grid)).isEqualTo(expected);
    }

    @Test
    public void shouldReturnMaxScoreForSingleRowOfOnes() {
        assertThat(new ScoreAfterFlippingMatrix().matrixScore(new int[][]{{1, 1, 1}})).isEqualTo(7);
    }

    @Test
    public void shouldFlipSingleColumnMatrixToMaximizeOnes() {
        assertThat(new ScoreAfterFlippingMatrix().matrixScore(new int[][]{{0}, {1}, {0}})).isEqualTo(3);
    }

    @Test
    public void shouldFlipAllZerosMatrixToAllOnes() {
        int[][] grid = {{0, 0}, {0, 0}};
        assertThat(new ScoreAfterFlippingMatrix().matrixScore(grid)).isEqualTo(6);
    }
}
