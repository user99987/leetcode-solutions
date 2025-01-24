package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatAndMouseTest {

    @Test
    public void testCase1() {
        assertEquals(0, new CatAndMouse().catMouseGame(new int[][]{{2, 5}, {3}, {0, 4, 5}, {1, 4, 5}, {2, 3}, {0, 2, 3}}));
    }

    @Test
    public void testCase2() {
        assertEquals(1, new CatAndMouse().catMouseGame(new int[][]{{1, 3}, {0}, {3}, {0, 2}}));
    }
}
