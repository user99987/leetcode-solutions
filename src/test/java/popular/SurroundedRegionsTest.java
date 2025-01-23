package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SurroundedRegionsTest {

    @Test
    public void testCase1() {
        char[][] board = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        new SurroundedRegions().solve(board);
        char[][] expected = {
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        assertArrayEquals(expected, board);
    }

    @Test
    public void testCase2() {
        char[][] board = {{'X'}};
        new SurroundedRegions().solve(board);
        char[][] expected = {{'X'}};
        assertArrayEquals(expected, board);
    }
}
