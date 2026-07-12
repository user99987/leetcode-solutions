package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaximalSquareTest {

    @Test
    public void testCase1() {
        assertThat(new MaximalSquare().maximalSquare(new char[][]{
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        })).isEqualTo(4);
    }

    @Test
    public void testCase2() {
        assertThat(new MaximalSquare().maximalSquare(new char[][]{
                {'0', '1'},
                {'1', '0'}
        })).isEqualTo(1);
    }

    @Test
    public void testCase3() {
        assertThat(new MaximalSquare().maximalSquare(new char[][]{
                {'0'}
        })).isEqualTo(0);
    }
}
