package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OutOfBoundaryPathsTest {

    @Test
    public void testCase1() {
        assertEquals(6, new OutOfBoundaryPaths().findPaths(2, 2, 2, 0, 0));
    }

    @Test
    public void testCase2() {
        assertEquals(12, new OutOfBoundaryPaths().findPaths(1, 3, 3, 0, 1));
    }

    @Test
    public void testCase3() {
        assertEquals(0, new OutOfBoundaryPaths().findPaths(2, 2, 0, 0, 0));
    }

}

