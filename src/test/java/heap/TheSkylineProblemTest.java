package heap;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class TheSkylineProblemTest {

    @Test
    void shouldComputeSkylineForOverlappingBuildings() {
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
        assertThat(new TheSkylineProblem().getSkyline(buildings)).isEqualTo(expected);
    }

    @Test
    void shouldComputeSkylineForAdjacentBuildingsOfSameHeight() {
        int[][] buildings = {{0, 2, 3}, {2, 5, 3}};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(0, 3),
                Arrays.asList(5, 0)
        );
        assertThat(new TheSkylineProblem().getSkyline(buildings)).isEqualTo(expected);
    }

    @Test
    void shouldProduceTwoKeyPointsForSingleBuilding() {
        int[][] buildings = {{0, 5, 10}};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(0, 10),
                Arrays.asList(5, 0)
        );
        assertThat(new TheSkylineProblem().getSkyline(buildings)).isEqualTo(expected);
    }

    @Test
    void shouldMergeIdenticalOverlappingBuildingsIntoOneOutline() {
        int[][] buildings = {{0, 5, 5}, {0, 5, 5}};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(0, 5),
                Arrays.asList(5, 0)
        );
        assertThat(new TheSkylineProblem().getSkyline(buildings)).isEqualTo(expected);
    }

    @Test
    void shouldHideShorterBuildingCompletelyCoveredByTallerOne() {
        int[][] buildings = {{0, 10, 5}, {2, 8, 3}};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(0, 5),
                Arrays.asList(10, 0)
        );
        assertThat(new TheSkylineProblem().getSkyline(buildings)).isEqualTo(expected);
    }
}
