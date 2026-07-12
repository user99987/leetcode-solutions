package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CourseScheduleTest {

    @Test
    public void testCase1() {
        assertThat(new CourseSchedule().canFinish(2, new int[][]{{1, 0}})).isTrue();
    }

    @Test
    public void testCase2() {
        assertThat(new CourseSchedule().canFinish(2, new int[][]{{1, 0}, {0, 1}})).isFalse();
    }
}
