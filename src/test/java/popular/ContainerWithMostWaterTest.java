package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ContainerWithMostWaterTest {

    @Test
    void testCase1() {
        assertThat(new ContainerWithMostWater().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7})).isEqualTo(49);
    }

    @Test
    void testCase2() {
        assertThat(new ContainerWithMostWater().maxArea(new int[]{1, 1})).isEqualTo(1);
    }

    @Test
    void testCase3() {
        assertThat(new ContainerWithMostWater().maxArea(new int[]{4, 3, 2, 1, 4})).isEqualTo(16);
    }

    @Test
    void testCase4() {
        assertThat(new ContainerWithMostWater().maxArea(new int[]{1, 2, 1})).isEqualTo(2);
    }

}
