package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MinimumDistanceToTypeAWordUsingTwoFingersTest {

    @Test
    public void shouldFindMinimumDistanceForShortWord() {
        assertThat(new MinimumDistanceToTypeAWordUsingTwoFingers().minimumDistance("CAKE")).isEqualTo(3);
    }

    @Test
    public void shouldFindMinimumDistanceForWordWithRepeatedLetter() {
        assertThat(new MinimumDistanceToTypeAWordUsingTwoFingers().minimumDistance("HAPPY")).isEqualTo(6);
    }

    @Test
    public void shouldReturnZeroWhenBothLettersAreSame() {
        assertThat(new MinimumDistanceToTypeAWordUsingTwoFingers().minimumDistance("AA")).isEqualTo(0);
    }

}
