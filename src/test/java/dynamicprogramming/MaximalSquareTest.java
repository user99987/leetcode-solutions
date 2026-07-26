package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaximalSquareTest {

    @Test
    public void shouldFindMaximalSquareAreaInMixedMatrix() {
        assertThat(new MaximalSquare().maximalSquare(new char[][]{
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        })).isEqualTo(4);
    }

    @Test
    public void shouldReturnOneForCheckerboardMatrix() {
        assertThat(new MaximalSquare().maximalSquare(new char[][]{
                {'0', '1'},
                {'1', '0'}
        })).isEqualTo(1);
    }

    @Test
    public void shouldReturnZeroForSingleZeroCell() {
        assertThat(new MaximalSquare().maximalSquare(new char[][]{
                {'0'}
        })).isEqualTo(0);
    }
}
