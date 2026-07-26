package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OutOfBoundaryPathsTest {

    @Test
    public void shouldCountPathsWithTwoMoves() {
        assertThat(new OutOfBoundaryPaths().findPaths(2, 2, 2, 0, 0)).isEqualTo(6);
    }

    @Test
    public void shouldCountPathsOnSingleRowGrid() {
        assertThat(new OutOfBoundaryPaths().findPaths(1, 3, 3, 0, 1)).isEqualTo(12);
    }

    @Test
    public void shouldReturnZeroWhenNoMovesAllowed() {
        assertThat(new OutOfBoundaryPaths().findPaths(2, 2, 0, 0, 0)).isEqualTo(0);
    }

}

