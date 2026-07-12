package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class BattleshipsInABoardTest {

    @Test
    public void testCase1() {
        char[][] board = {
                {'X', '.', '.', 'X'},
                {'.', '.', '.', 'X'},
                {'.', '.', '.', 'X'}
        };
        assertThat(new BattleshipsInABoard().countBattleships(board)).isEqualTo(2);
    }

    @Test
    public void testCase2() {
        char[][] board = {{'.'}};
        assertThat(new BattleshipsInABoard().countBattleships(board)).isEqualTo(0);
    }
}
