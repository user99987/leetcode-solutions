package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CanIWinTest {

    @Test
    public void testCase1() {
        assertThat(new CanIWin().canIWin(10, 11)).isFalse();
    }

    @Test
    public void testCase2() {
        assertThat(new CanIWin().canIWin(10, 0)).isTrue();
    }

    @Test
    public void testCase3() {
        assertThat(new CanIWin().canIWin(10, 1)).isTrue();
    }
}
