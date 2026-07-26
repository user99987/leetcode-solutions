package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class InsertIntervalTest {

    @Test
    public void shouldMergeNewIntervalWithOverlappingInterval() {
        var result = new InsertInterval().insert(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5});
        int[][] expected = {{1, 5}, {6, 9}};
        assertThat(java.util.Arrays.deepEquals(result, expected)).isTrue();
    }

    @Test
    public void shouldMergeNewIntervalWithMultipleOverlappingIntervals() {
        int[][] result = new InsertInterval().insert(
                new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}}, new int[]{4, 8});
        int[][] expected = {{1, 2}, {3, 10}, {12, 16}};
        assertThat(java.util.Arrays.deepEquals(result, expected)).isTrue();
    }

    @Test
    public void shouldInsertIntoEmptyIntervalList() {
        var result = new InsertInterval().insert(new int[][]{}, new int[]{5, 7});
        int[][] expected = {{5, 7}};
        assertThat(java.util.Arrays.deepEquals(result, expected)).isTrue();
    }

    @Test
    public void shouldNotChangeIntervalsWhenNewIntervalIsContainedWithinExisting() {
        var result = new InsertInterval().insert(new int[][]{{1, 5}}, new int[]{2, 3});
        int[][] expected = {{1, 5}};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void shouldExtendExistingIntervalWithNewInterval() {
        var result = new InsertInterval().insert(new int[][]{{1, 5}}, new int[]{2, 7});
        int[][] expected = {{1, 7}};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void shouldInsertNewIntervalAtStartWhenBeforeAll() {
        var result = new InsertInterval().insert(new int[][]{{5, 10}}, new int[]{1, 2});
        int[][] expected = {{1, 2}, {5, 10}};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void shouldInsertNewIntervalAtEndWhenAfterAll() {
        var result = new InsertInterval().insert(new int[][]{{1, 2}}, new int[]{5, 10});
        int[][] expected = {{1, 2}, {5, 10}};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void shouldMergeWhenNewIntervalTouchesBoundary() {
        // touching interval [3,4] and new interval [4,5] should merge because endpoints are adjacent/equal
        var result = new InsertInterval().insert(new int[][]{{1, 3}}, new int[]{3, 5});
        int[][] expected = {{1, 5}};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void shouldMergeAllIntervalsWhenNewIntervalOverlapsThemAll() {
        var result = new InsertInterval().insert(new int[][]{{1, 2}, {3, 4}, {5, 6}}, new int[]{0, 10});
        int[][] expected = {{0, 10}};
        assertThat(result).isEqualTo(expected);
    }
}
