package popular;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


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
        assertThat(board).isDeepEqualTo(expected);
    }

    @Test
    public void testCase2() {
        char[][] board = {{'X'}};
        new SurroundedRegions().solve(board);
        char[][] expected = {{'X'}};
        assertThat(board).isDeepEqualTo(expected);
    }
}
