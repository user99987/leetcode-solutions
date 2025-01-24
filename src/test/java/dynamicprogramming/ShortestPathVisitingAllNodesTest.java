package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShortestPathVisitingAllNodesTest {

    @Test
    public void testCase1() {
        assertEquals(4, new ShortestPathVisitingAllNodes().shortestPathLength(new int[][]{{1, 2, 3}, {0}, {0}, {0}}));
    }

    @Test
    public void testCase2() {
        assertEquals(4, new ShortestPathVisitingAllNodes().shortestPathLength(new int[][]{{1}, {0, 2, 4}, {1, 3, 4}, {2}, {1, 2}}));
    }

    @Test
    public void testCase3() {
        assertEquals(0, new ShortestPathVisitingAllNodes().shortestPathLength(new int[][]{{}}));
    }

    @Test
    public void testCase4() {
        assertEquals(1, new ShortestPathVisitingAllNodes().shortestPathLength(new int[][]{{1}, {0}}));
    }

}
