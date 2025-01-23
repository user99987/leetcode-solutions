package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CourseScheduleTest {

    @Test
    public void testCase1() {
        assertTrue(new CourseSchedule().canFinish(2, new int[][]{{1, 0}}));
    }

    @Test
    public void testCase2() {
        assertFalse(new CourseSchedule().canFinish(2, new int[][]{{1, 0}, {0, 1}}));
    }
}
