package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxPointsOnLineTest {

    @Test
    public void testCase1() {
        assertEquals(3, new MaxPointsOnLine().maxPoints(new int[][]{{1, 1}, {2, 2}, {3, 3}}));
    }

    @Test
    public void testCase2() {
        assertEquals(4, new MaxPointsOnLine().maxPoints(new int[][]{{1, 1}, {3, 2}, {5, 3}, {4, 1}, {2, 3}, {1, 4}}));
    }
}
