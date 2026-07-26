package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ContainerWithMostWaterTest {

    @Test
    void shouldFindMaxAreaForVariedHeightsArray() {
        assertThat(new ContainerWithMostWater().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7})).isEqualTo(49);
    }

    @Test
    void shouldReturnOneForTwoEqualHeightLines() {
        assertThat(new ContainerWithMostWater().maxArea(new int[]{1, 1})).isEqualTo(1);
    }

    @Test
    void shouldFindMaxAreaUsingOuterTallLines() {
        assertThat(new ContainerWithMostWater().maxArea(new int[]{4, 3, 2, 1, 4})).isEqualTo(16);
    }

    @Test
    void shouldFindMaxAreaForThreeLines() {
        assertThat(new ContainerWithMostWater().maxArea(new int[]{1, 2, 1})).isEqualTo(2);
    }

}
