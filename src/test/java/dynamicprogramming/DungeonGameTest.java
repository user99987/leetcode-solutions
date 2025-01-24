package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DungeonGameTest {

    @Test
    public void testCase1() {
        assertEquals(7, new DungeonGame().calculateMinimumHP(new int[][]{{-2, -3, 3}, {-5, -10, 1}, {10, 30, -5}}));
    }

    @Test
    public void testCase2() {
        assertEquals(1, new DungeonGame().calculateMinimumHP(new int[][]{{0}}));
    }
}
