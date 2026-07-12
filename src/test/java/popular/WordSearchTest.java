package popular;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class WordSearchTest {

    @Test
    public void testCase1() {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        assertThat(new WordSearch().exist(board, "ABCCED")).isTrue();
    }

    @Test
    public void testCase2() {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        assertThat(new WordSearch().exist(board, "SEE")).isTrue();
    }

    @Test
    public void testCase3() {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        assertThat(new WordSearch().exist(board, "ABCB")).isFalse();
    }
}
