package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ShortestPathVisitingAllNodesTest {

    @Test
    public void shouldFindShortestPathThroughStarGraph() {
        assertThat(new ShortestPathVisitingAllNodes().shortestPathLength(new int[][]{{1, 2, 3}, {0}, {0}, {0}})).isEqualTo(4);
    }

    @Test
    public void shouldFindShortestPathThroughDenserGraph() {
        assertThat(new ShortestPathVisitingAllNodes().shortestPathLength(new int[][]{{1}, {0, 2, 4}, {1, 3, 4}, {2}, {1, 2}})).isEqualTo(4);
    }

    @Test
    public void shouldReturnZeroForSingleNodeGraph() {
        assertThat(new ShortestPathVisitingAllNodes().shortestPathLength(new int[][]{{}})).isEqualTo(0);
    }

    @Test
    public void shouldReturnOneForTwoConnectedNodes() {
        assertThat(new ShortestPathVisitingAllNodes().shortestPathLength(new int[][]{{1}, {0}})).isEqualTo(1);
    }

}
