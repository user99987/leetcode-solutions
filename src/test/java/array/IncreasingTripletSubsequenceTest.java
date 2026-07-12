package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class IncreasingTripletSubsequenceTest {

    @Test
    public void testCase1() {
        assertThat(new IncreasingTripletSubsequence().increasingTriplet(new int[]{1, 2, 3, 4, 5})).isTrue();
    }

    @Test
    public void testCase2() {
        assertThat(new IncreasingTripletSubsequence().increasingTriplet(new int[]{5, 4, 3, 2, 1})).isFalse();
    }

    @Test
    public void testCase3() {
        assertThat(new IncreasingTripletSubsequence().increasingTriplet(new int[]{2, 1, 5, 0, 4, 6})).isTrue();
    }
}
