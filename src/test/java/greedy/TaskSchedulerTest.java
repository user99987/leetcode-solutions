package greedy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TaskSchedulerTest {

    @Test
    public void shouldRequireIdleSlotsWhenCooldownExceedsAvailableTasks() {
        assertThat(new TaskScheduler().leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 2)).isEqualTo(8);
    }

    @Test
    public void shouldNeedNoIdleWhenCooldownIsZero() {
        assertThat(new TaskScheduler().leastInterval(new char[]{'A', 'A', 'A', 'B', 'B', 'B'}, 0)).isEqualTo(6);
    }

    @Test
    public void shouldFillCooldownWithOtherTasksWhenPossible() {
        assertThat(new TaskScheduler().leastInterval(
                new char[]{'A', 'A', 'A', 'A', 'A', 'A', 'B', 'C', 'D', 'E', 'F', 'G'}, 2)).isEqualTo(16);
    }

    @Test
    public void shouldTakeOneUnitForSingleTask() {
        assertThat(new TaskScheduler().leastInterval(new char[]{'A'}, 5)).isEqualTo(1);
    }

    @Test
    public void shouldNeedNoIdleWhenAllTasksAreDistinct() {
        assertThat(new TaskScheduler().leastInterval(new char[]{'A', 'B', 'C', 'D'}, 2)).isEqualTo(4);
    }

    @Test
    public void shouldNeedNoIdleWhenEnoughDistinctTasksFillCooldown() {
        assertThat(new TaskScheduler().leastInterval(new char[]{'A', 'A', 'B', 'B', 'C', 'C'}, 2)).isEqualTo(6);
    }
}
