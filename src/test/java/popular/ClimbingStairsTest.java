package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ClimbingStairsTest {

    @Test
    void shouldReturnTwoWaysForTwoSteps() {
        assertThat(new ClimbingStairs().climbStairs(2)).isEqualTo(2);
    }

    @Test
    void shouldReturnThreeWaysForThreeSteps() {
        assertThat(new ClimbingStairs().climbStairs(3)).isEqualTo(3);
    }
}
