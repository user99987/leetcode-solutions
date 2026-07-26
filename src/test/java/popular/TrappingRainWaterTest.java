package popular;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class TrappingRainWaterTest {

    @Test
    public void shouldTrapWaterBetweenVaryingHeights() {
        assertThat(new TrappingRainWater().trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1})).isEqualTo(6);
    }

    @Test
    public void shouldTrapWaterWithDescendingThenAscendingHeights() {
        assertThat(new TrappingRainWater().trap(new int[]{4, 2, 0, 3, 2, 5})).isEqualTo(9);
    }
}
