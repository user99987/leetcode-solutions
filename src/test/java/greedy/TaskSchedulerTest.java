package greedy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TaskSchedulerTest {

    @Test
    public void testCase1() {
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        var n = 2;
        var expected = 8; // A -> B -> idle -> A -> B -> idle -> A -> B
        assertThat(new TaskScheduler().leastInterval(tasks, n)).isEqualTo(expected);
    }

    @Test
    public void testCase2() {
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        var n = 0;
        var expected = 6; // No cooldown required, tasks can be arranged consecutively.
        assertThat(new TaskScheduler().leastInterval(tasks, n)).isEqualTo(expected);
    }

    @Test
    public void testCase3() {
        char[] tasks = {'A', 'A', 'A', 'A', 'A', 'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        var n = 2;
        var expected = 16; // A -> B -> C -> A -> D -> E -> A -> F -> G -> A -> idle -> idle -> A -> idle -> idle -> A
        assertThat(new TaskScheduler().leastInterval(tasks, n)).isEqualTo(expected);
    }
}
