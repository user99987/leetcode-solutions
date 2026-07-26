package popular;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class WordSearchTest {

    @Test
    public void shouldFindWordFollowingPathThroughBoard() {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        assertThat(new WordSearch().exist(board, "ABCCED")).isTrue();
    }

    @Test
    public void shouldFindShortWordReusingBoardStructure() {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        assertThat(new WordSearch().exist(board, "SEE")).isTrue();
    }

    @Test
    public void shouldReturnFalseWhenWordReusesSameCellTwice() {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        assertThat(new WordSearch().exist(board, "ABCB")).isFalse();
    }
}
