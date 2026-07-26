package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ValidTicTacToeStateTest {

    @Test
    public void shouldReturnFalseWhenOMovesBeforeX() {
        assertThat(new ValidTicTacToeState().validTicTacToe(new String[]{"O  ", "   ", "   "})).isFalse();
    }

    @Test
    public void shouldReturnFalseWhenPlayerContinuesAfterWinning() {
        assertThat(new ValidTicTacToeState().validTicTacToe(new String[]{"XOX", " X ", "   "})).isFalse();
    }

    @Test
    public void shouldReturnTrueForValidFullBoard() {
        assertThat(new ValidTicTacToeState().validTicTacToe(new String[]{"XOX", "O O", "XOX"})).isTrue();
    }

    @Test
    public void shouldReturnTrueForEmptyBoard() {
        assertThat(new ValidTicTacToeState().validTicTacToe(new String[]{"   ", "   ", "   "})).isTrue();
    }

    @Test
    public void shouldReturnTrueWhenXWinsWithCorrectMoveCounts() {
        assertThat(new ValidTicTacToeState().validTicTacToe(new String[]{"XXX", "OO ", "   "})).isTrue();
    }

    @Test
    public void shouldReturnFalseWhenXWinsButMoveCountsAreEqual() {
        // X shouldn't have won with equal X/O counts since X always moves first
        assertThat(new ValidTicTacToeState().validTicTacToe(new String[]{"XXX", "OOO", "   "})).isFalse();
    }

    @Test
    public void shouldReturnFalseWhenOWinsButXHasExtraMove() {
        // O has won (top row), but X made an extra move afterwards - invalid game state
        assertThat(new ValidTicTacToeState().validTicTacToe(new String[]{"OOO", "XX ", "X X"})).isFalse();
    }

    @Test
    public void shouldReturnFalseWhenBothPlayersHaveWinningLines() {
        assertThat(new ValidTicTacToeState().validTicTacToe(new String[]{"XXX", "OOO", "   "})).isFalse();
    }

    @Test
    public void shouldReturnTrueForFullBoardDraw() {
        assertThat(new ValidTicTacToeState().validTicTacToe(new String[]{"XOX", "XOX", "OXO"})).isTrue();
    }

    @Test
    public void shouldReturnTrueForValidDiagonalWin() {
        // X wins on the main diagonal with a balanced move count (xCount = oCount + 1)
        assertThat(new ValidTicTacToeState().validTicTacToe(new String[]{"XO ", " X ", "O X"})).isTrue();
    }

    @Test
    public void shouldReturnTrueForValidAntiDiagonalWin() {
        // X wins on the anti-diagonal with a balanced move count (xCount = oCount + 1)
        assertThat(new ValidTicTacToeState().validTicTacToe(new String[]{" OX", " X ", "XO "})).isTrue();
    }
}
