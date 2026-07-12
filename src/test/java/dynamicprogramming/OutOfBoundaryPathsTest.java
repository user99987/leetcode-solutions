package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OutOfBoundaryPathsTest {

    @Test
    public void testCase1() {
        assertThat(new OutOfBoundaryPaths().findPaths(2, 2, 2, 0, 0)).isEqualTo(6);
    }

    @Test
    public void testCase2() {
        assertThat(new OutOfBoundaryPaths().findPaths(1, 3, 3, 0, 1)).isEqualTo(12);
    }

    @Test
    public void testCase3() {
        assertThat(new OutOfBoundaryPaths().findPaths(2, 2, 0, 0, 0)).isEqualTo(0);
    }

}

