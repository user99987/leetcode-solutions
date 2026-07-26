package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class KnightDialerTest {

    @Test
    public void shouldReturnTenForLengthOne() {
        assertThat(new KnightDialer().knightDialer(1)).isEqualTo(10);
    }

    @Test
    public void shouldReturnTwentyForLengthTwo() {
        assertThat(new KnightDialer().knightDialer(2)).isEqualTo(20);
    }

    @Test
    public void shouldApplyModuloForLargeLength() {
        assertThat(new KnightDialer().knightDialer(3131)).isEqualTo(136006598);
    }
}
