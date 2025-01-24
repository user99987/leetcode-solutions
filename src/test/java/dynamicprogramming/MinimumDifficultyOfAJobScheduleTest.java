package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumDifficultyOfAJobScheduleTest {

    @Test
    public void testCase1() {
        assertEquals(7, new MinimumDifficultyOfAJobSchedule().minDifficulty(new int[]{6, 5, 4, 3, 2, 1}, 2));
    }

    @Test
    public void testCase2() {
        assertEquals(-1, new MinimumDifficultyOfAJobSchedule().minDifficulty(new int[]{9, 9, 9}, 4));
    }

    @Test
    public void testCase3() {
        assertEquals(3, new MinimumDifficultyOfAJobSchedule().minDifficulty(new int[]{1, 1, 1}, 3));
    }
}
