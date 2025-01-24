package heap;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

class TheSkylineProblemTest {

    @Test
    void testCase1() {
        int[][] buildings = {{2, 9, 10}, {3, 7, 15}, {5, 12, 12}, {15, 20, 10}, {19, 24, 8}};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(2, 10),
                Arrays.asList(3, 15),
                Arrays.asList(7, 12),
                Arrays.asList(12, 0),
                Arrays.asList(15, 10),
                Arrays.asList(20, 8),
                Arrays.asList(24, 0)
        );
        assertEquals(expected, new TheSkylineProblem().getSkyline(buildings));
    }

    @Test
    void testCase2() {
        int[][] buildings = {{0, 2, 3}, {2, 5, 3}};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(0, 3),
                Arrays.asList(5, 0)
        );
        assertEquals(expected, new TheSkylineProblem().getSkyline(buildings));
    }
}
