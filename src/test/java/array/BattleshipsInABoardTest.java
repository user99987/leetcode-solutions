package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class BattleshipsInABoardTest {

    @Test
    public void shouldCountTwoSeparateBattleships() {
        char[][] board = {
                {'X', '.', '.', 'X'},
                {'.', '.', '.', 'X'},
                {'.', '.', '.', 'X'}
        };
        assertThat(new BattleshipsInABoard().countBattleships(board)).isEqualTo(2);
    }

    @Test
    public void shouldReturnZeroForSingleEmptyCell() {
        char[][] board = {{'.'}};
        assertThat(new BattleshipsInABoard().countBattleships(board)).isEqualTo(0);
    }

    @Test
    public void shouldReturnOneForSingleBattleshipCell() {
        char[][] board = {{'X'}};
        assertThat(new BattleshipsInABoard().countBattleships(board)).isEqualTo(1);
    }

    @Test
    public void shouldCountHorizontalBattleshipOnce() {
        char[][] board = {{'X', 'X', 'X'}};
        assertThat(new BattleshipsInABoard().countBattleships(board)).isEqualTo(1);
    }

    @Test
    public void shouldCountVerticalBattleshipOnce() {
        char[][] board = {{'X'}, {'X'}, {'X'}};
        assertThat(new BattleshipsInABoard().countBattleships(board)).isEqualTo(1);
    }

    @Test
    public void shouldReturnZeroForEmptyBoard() {
        char[][] board = {{'.', '.'}, {'.', '.'}};
        assertThat(new BattleshipsInABoard().countBattleships(board)).isEqualTo(0);
    }

    @Test
    public void shouldCountMultipleSeparatedShipsOnFullyPackedBoard() {
        char[][] board = {
                {'X', '.', 'X'},
                {'.', '.', '.'},
                {'X', '.', 'X'}
        };
        assertThat(new BattleshipsInABoard().countBattleships(board)).isEqualTo(4);
    }

    @Test
    public void shouldReturnZeroForNullBoard() {
        assertThat(new BattleshipsInABoard().countBattleships(null)).isEqualTo(0);
    }
}
