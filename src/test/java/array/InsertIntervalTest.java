package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class InsertIntervalTest {

    @Test
    public void testCase1() {
        var result = new InsertInterval().insert(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5});
        int[][] expected = {{1, 5}, {6, 9}};
        assertThat(java.util.Arrays.deepEquals(result, expected)).isTrue();
    }

    @Test
    public void testCase2() {
        int[][] result = new InsertInterval().insert(
                new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}}, new int[]{4, 8});
        int[][] expected = {{1, 2}, {3, 10}, {12, 16}};
        assertThat(java.util.Arrays.deepEquals(result, expected)).isTrue();
    }

    @Test
    public void testCase3() {
        var result = new InsertInterval().insert(new int[][]{}, new int[]{5, 7});
        int[][] expected = {{5, 7}};
        assertThat(java.util.Arrays.deepEquals(result, expected)).isTrue();
    }
}
