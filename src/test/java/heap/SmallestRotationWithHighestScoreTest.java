package heap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SmallestRotationWithHighestScoreTest {

    @Test
    public void testCase1() {
        assertThat(new SmallestRotationWithHighestScore().bestRotation(new int[]{2, 3, 1, 4, 0})).isEqualTo(3);
    }

    @Test
    public void testCase2() {
        assertThat(new SmallestRotationWithHighestScore().bestRotation(new int[]{1, 3, 0, 2, 4})).isEqualTo(0);
    }
}
