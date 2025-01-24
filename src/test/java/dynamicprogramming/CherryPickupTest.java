package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CherryPickupTest {

    @Test
    public void testCase1() {
        assertEquals(5, new CherryPickup().cherryPickup(new int[][]{{0, 1, -1}, {1, 0, -1}, {1, 1, 1}}));
    }

    @Test
    public void testCase2() {
        assertEquals(0, new CherryPickup().cherryPickup(new int[][]{{1, 1, -1}, {1, -1, 1}, {-1, 1, 1}}));
    }
}
