package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximalSquareTest {

    @Test
    public void testCase1() {
        assertEquals(4, new MaximalSquare().maximalSquare(new char[][]{
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        }));
    }

    @Test
    public void testCase2() {
        assertEquals(1, new MaximalSquare().maximalSquare(new char[][]{
                {'0', '1'},
                {'1', '0'}
        }));
    }

    @Test
    public void testCase3() {
        assertEquals(0, new MaximalSquare().maximalSquare(new char[][]{
                {'0'}
        }));
    }
}
