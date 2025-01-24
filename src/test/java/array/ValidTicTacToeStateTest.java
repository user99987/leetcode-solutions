package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidTicTacToeStateTest {

    @Test
    public void testCase1() {
        assertFalse(new ValidTicTacToeState().validTicTacToe(new String[]{"O  ", "   ", "   "}));
    }

    @Test
    public void testCase2() {
        assertFalse(new ValidTicTacToeState().validTicTacToe(new String[]{"XOX", " X ", "   "}));
    }

    @Test
    public void testCase3() {
        assertTrue(new ValidTicTacToeState().validTicTacToe(new String[]{"XOX", "O O", "XOX"}));
    }
}
