package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MinimumDistanceToTypeAWordUsingTwoFingersTest {

    @Test
    public void testCase1() {
        assertThat(new MinimumDistanceToTypeAWordUsingTwoFingers().minimumDistance("CAKE")).isEqualTo(3);
    }

    @Test
    public void testCase2() {
        assertThat(new MinimumDistanceToTypeAWordUsingTwoFingers().minimumDistance("HAPPY")).isEqualTo(6);
    }

    @Test
    public void testCase3() {
        assertThat(new MinimumDistanceToTypeAWordUsingTwoFingers().minimumDistance("AA")).isEqualTo(0);
    }

}
