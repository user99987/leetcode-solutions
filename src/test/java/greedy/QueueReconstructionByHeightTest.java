package greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QueueReconstructionByHeightTest {

    @Test
    public void testCase1() {
        int[][] input = {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
        int[][] expected = {{5, 0}, {7, 0}, {5, 2}, {6, 1}, {4, 4}, {7, 1}};
        assertArrayEquals(expected, new QueueReconstructionByHeight().reconstructQueue(input));
    }

    @Test
    public void testCase2() {
        int[][] input = {{6, 0}, {5, 0}, {4, 0}, {3, 2}, {2, 2}, {1, 4}};
        int[][] expected = {{4, 0}, {5, 0}, {2, 2}, {3, 2}, {1, 4}, {6, 0}};
        assertArrayEquals(expected, new QueueReconstructionByHeight().reconstructQueue(input));
    }
}
