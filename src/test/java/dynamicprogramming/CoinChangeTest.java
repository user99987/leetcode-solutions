package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CoinChangeTest {

    @Test
    public void testCase1() {
        assertThat(new CoinChange().coinChange(new int[]{1, 2, 5}, 11)).isEqualTo(3);
    }

    @Test
    public void testCase2() {
        assertThat(new CoinChange().coinChange(new int[]{2}, 3)).isEqualTo(-1);
    }

    @Test
    public void testCase3() {
        assertThat(new CoinChange().coinChange(new int[]{1}, 0)).isEqualTo(0);
    }
}
