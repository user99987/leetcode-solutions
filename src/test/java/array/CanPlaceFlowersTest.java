package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CanPlaceFlowersTest {

    @Test
    public void testCase1() {
        assertThat(new CanPlaceFlowers().canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1)).isTrue();
    }

    @Test
    public void testCase2() {
        assertThat(new CanPlaceFlowers().canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2)).isFalse();
    }

    @Test
    public void testCase3() {
        assertThat(new CanPlaceFlowers().canPlaceFlowers(new int[]{0, 0, 1, 0, 0}, 2)).isTrue();
    }
}
