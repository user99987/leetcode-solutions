package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SurfaceAreaOfThreeDShapesTest {

    @Test
    public void testCase1() {
        assertThat(new SurfaceAreaOfThreeDShapes().surfaceArea(new int[][]{{1, 2}, {3, 4}})).isEqualTo(34);
    }

    @Test
    public void testCase2() {
        assertThat(new SurfaceAreaOfThreeDShapes().surfaceArea(new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}})).isEqualTo(32);
    }

    @Test
    public void testCase3() {
        assertThat(new SurfaceAreaOfThreeDShapes().surfaceArea(new int[][]{{2, 2, 2}, {2, 1, 2}, {2, 2, 2}})).isEqualTo(46);
    }
}
