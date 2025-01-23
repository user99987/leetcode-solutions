package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniquePathsTest {

    @Test
    public void testCase1() {
        assertEquals(28, new UniquePaths().uniquePaths(3, 7));
    }

    @Test
    public void testCase2() {
        assertEquals(3, new UniquePaths().uniquePaths(3, 2));
    }

    @Test
    public void testCase3() {
        assertEquals(28, new UniquePaths().uniquePaths(7, 3));
    }

    @Test
    public void testCase4() {
        assertEquals(6, new UniquePaths().uniquePaths(3, 3));
    }
}
