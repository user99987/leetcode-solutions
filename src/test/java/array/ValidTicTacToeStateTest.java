package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ValidTicTacToeStateTest {

    @Test
    public void testCase1() {
        assertThat(new ValidTicTacToeState().validTicTacToe(new String[]{"O  ", "   ", "   "})).isFalse();
    }

    @Test
    public void testCase2() {
        assertThat(new ValidTicTacToeState().validTicTacToe(new String[]{"XOX", " X ", "   "})).isFalse();
    }

    @Test
    public void testCase3() {
        assertThat(new ValidTicTacToeState().validTicTacToe(new String[]{"XOX", "O O", "XOX"})).isTrue();
    }
}
