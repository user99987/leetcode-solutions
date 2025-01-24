package greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScoreAfterFlippingMatrixTest {

    @Test
    public void testCase1() {
        int[][] grid = {
                {0, 0, 1, 1},
                {1, 0, 1, 0},
                {1, 1, 0, 0}
        };
        int expected = 39;
        assertEquals(expected, new ScoreAfterFlippingMatrix().matrixScore(grid));
    }

    @Test
    public void testCase2() {
        int[][] grid = {
                {0}
        };
        int expected = 1;
        assertEquals(expected, new ScoreAfterFlippingMatrix().matrixScore(grid));
    }
}
