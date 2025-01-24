package greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskSchedulerTest {

    @Test
    public void testCase1() {
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 2;
        int expected = 8; // A -> B -> idle -> A -> B -> idle -> A -> B
        assertEquals(expected, new TaskScheduler().leastInterval(tasks, n));
    }

    @Test
    public void testCase2() {
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        int n = 0;
        int expected = 6; // No cooldown required, tasks can be arranged consecutively.
        assertEquals(expected, new TaskScheduler().leastInterval(tasks, n));
    }

    @Test
    public void testCase3() {
        char[] tasks = {'A', 'A', 'A', 'A', 'A', 'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        int n = 2;
        int expected = 16; // A -> B -> C -> A -> D -> E -> A -> F -> G -> A -> idle -> idle -> A -> idle -> idle -> A
        assertEquals(expected, new TaskScheduler().leastInterval(tasks, n));
    }
}
