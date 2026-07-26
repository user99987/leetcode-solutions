package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SurfaceAreaOfThreeDShapesTest {

    @Test
    public void shouldComputeSurfaceAreaForSmallGrid() {
        assertThat(new SurfaceAreaOfThreeDShapes().surfaceArea(new int[][]{{1, 2}, {3, 4}})).isEqualTo(34);
    }

    @Test
    public void shouldComputeSurfaceAreaWithHoleInMiddle() {
        assertThat(new SurfaceAreaOfThreeDShapes().surfaceArea(new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}})).isEqualTo(32);
    }

    @Test
    public void shouldComputeSurfaceAreaForTallerGridWithHole() {
        assertThat(new SurfaceAreaOfThreeDShapes().surfaceArea(new int[][]{{2, 2, 2}, {2, 1, 2}, {2, 2, 2}})).isEqualTo(46);
    }

    @Test
    public void shouldReturnSurfaceOfSingleCubeForSingleCellGrid() {
        assertThat(new SurfaceAreaOfThreeDShapes().surfaceArea(new int[][]{{1}})).isEqualTo(6);
    }

    @Test
    public void shouldReturnZeroForEmptyGridWithZeroHeightEverywhere() {
        assertThat(new SurfaceAreaOfThreeDShapes().surfaceArea(new int[][]{{0, 0}, {0, 0}})).isEqualTo(0);
    }

    @Test
    public void shouldComputeCorrectSurfaceAreaForSingleTallTower() {
        // a single 1x1 column of height h has surface area 4h + 2
        assertThat(new SurfaceAreaOfThreeDShapes().surfaceArea(new int[][]{{5}})).isEqualTo(22);
    }

    @Test
    public void shouldShareFacesBetweenAdjacentCubesInFlatUniformGrid() {
        assertThat(new SurfaceAreaOfThreeDShapes().surfaceArea(new int[][]{{1, 1}, {1, 1}})).isEqualTo(16);
    }
}
