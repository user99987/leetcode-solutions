package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class IncreasingTripletSubsequenceTest {

    @Test
    public void shouldFindTripletInStrictlyIncreasingArray() {
        assertThat(new IncreasingTripletSubsequence().increasingTriplet(new int[]{1, 2, 3, 4, 5})).isTrue();
    }

    @Test
    public void shouldReturnFalseForStrictlyDecreasingArray() {
        assertThat(new IncreasingTripletSubsequence().increasingTriplet(new int[]{5, 4, 3, 2, 1})).isFalse();
    }

    @Test
    public void shouldFindTripletInMixedArray() {
        assertThat(new IncreasingTripletSubsequence().increasingTriplet(new int[]{2, 1, 5, 0, 4, 6})).isTrue();
    }

    @Test
    public void shouldReturnFalseWhenArrayShorterThanThree() {
        assertThat(new IncreasingTripletSubsequence().increasingTriplet(new int[]{1})).isFalse();
        assertThat(new IncreasingTripletSubsequence().increasingTriplet(new int[]{1, 2})).isFalse();
    }

    @Test
    public void shouldReturnFalseWhenAllElementsEqual() {
        assertThat(new IncreasingTripletSubsequence().increasingTriplet(new int[]{1, 1, 1, 1})).isFalse();
    }

    @Test
    public void shouldFindTripletAtVeryEndOfArray() {
        assertThat(new IncreasingTripletSubsequence().increasingTriplet(new int[]{5, 4, 3, 2, 1, 2, 3})).isTrue();
    }

    @Test
    public void shouldHandleOverflowSafelyWithMinMaxValues() {
        assertThat(new IncreasingTripletSubsequence().increasingTriplet(
                new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE + 1, Integer.MAX_VALUE})).isTrue();
    }
}
