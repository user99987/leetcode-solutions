package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ClimbingStairsTest {

    @Test
    void testCase1() {
        assertThat(new ClimbingStairs().climbStairs(2)).isEqualTo(2);
    }

    @Test
    void testCase2() {
        assertThat(new ClimbingStairs().climbStairs(3)).isEqualTo(3);
    }
}
