package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BurstBalloonsTest {

    @Test
    public void testCase1() {
        assertThat(new BurstBalloons().maxCoins(new int[]{3, 1, 5, 8})).isEqualTo(167);
    }

    @Test
    public void testCase2() {
        assertThat(new BurstBalloons().maxCoins(new int[]{1, 5})).isEqualTo(10);
    }
}
