package heap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SmallestRotationWithHighestScoreTest {

    @Test
    public void shouldFindBestRotationForMixedArray() {
        assertThat(new SmallestRotationWithHighestScore().bestRotation(new int[]{2, 3, 1, 4, 0})).isEqualTo(3);
    }

    @Test
    public void shouldReturnZeroWhenAllRotationsScoreEqually() {
        assertThat(new SmallestRotationWithHighestScore().bestRotation(new int[]{1, 3, 0, 2, 4})).isEqualTo(0);
    }

    @Test
    public void shouldReturnZeroForSingleElementArray() {
        assertThat(new SmallestRotationWithHighestScore().bestRotation(new int[]{0})).isEqualTo(0);
    }

    @Test
    public void shouldReturnZeroForAlreadySortedAscendingArray() {
        assertThat(new SmallestRotationWithHighestScore().bestRotation(new int[]{0, 1, 2, 3})).isEqualTo(0);
    }

    @Test
    public void shouldEvaluateBothRotationsForTwoElementArray() {
        // k=0 -> [1,0] score=1 (only index1 qualifies); k=1 -> [0,1] score=2 (both qualify)
        assertThat(new SmallestRotationWithHighestScore().bestRotation(new int[]{1, 0})).isEqualTo(1);
    }
}
