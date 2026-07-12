package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MinimumDifficultyOfAJobScheduleTest {

    @Test
    public void testCase1() {
        assertThat(new MinimumDifficultyOfAJobSchedule().minDifficulty(new int[]{6, 5, 4, 3, 2, 1}, 2)).isEqualTo(7);
    }

    @Test
    public void testCase2() {
        assertThat(new MinimumDifficultyOfAJobSchedule().minDifficulty(new int[]{9, 9, 9}, 4)).isEqualTo(-1);
    }

    @Test
    public void testCase3() {
        assertThat(new MinimumDifficultyOfAJobSchedule().minDifficulty(new int[]{1, 1, 1}, 3)).isEqualTo(3);
    }
}
