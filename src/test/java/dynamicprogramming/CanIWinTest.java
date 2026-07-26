package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CanIWinTest {

    @Test
    public void shouldReturnFalseWhenSecondPlayerAlwaysWins() {
        assertThat(new CanIWin().canIWin(10, 11)).isFalse();
    }

    @Test
    public void shouldReturnTrueWhenTargetIsZeroOrLess() {
        assertThat(new CanIWin().canIWin(10, 0)).isTrue();
    }

    @Test
    public void shouldReturnTrueWhenFirstMoveCanReachTarget() {
        assertThat(new CanIWin().canIWin(10, 1)).isTrue();
    }
}
