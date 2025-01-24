package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SurfaceAreaOfThreeDShapesTest {

    @Test
    public void testCase1() {
        assertEquals(34, new SurfaceAreaOfThreeDShapes().surfaceArea(new int[][]{{1, 2}, {3, 4}}));
    }

    @Test
    public void testCase2() {
        assertEquals(32, new SurfaceAreaOfThreeDShapes().surfaceArea(new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}}));
    }

    @Test
    public void testCase3() {
        assertEquals(46, new SurfaceAreaOfThreeDShapes().surfaceArea(new int[][]{{2, 2, 2}, {2, 1, 2}, {2, 2, 2}}));
    }
}
