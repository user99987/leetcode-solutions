package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BattleshipsInABoardTest {

    @Test
    public void testCase1() {
        char[][] board = {
                {'X', '.', '.', 'X'},
                {'.', '.', '.', 'X'},
                {'.', '.', '.', 'X'}
        };
        assertEquals(2, new BattleshipsInABoard().countBattleships(board));
    }

    @Test
    public void testCase2() {
        char[][] board = {{'.'}};
        assertEquals(0, new BattleshipsInABoard().countBattleships(board));
    }
}
