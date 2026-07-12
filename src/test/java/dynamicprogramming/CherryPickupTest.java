package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CherryPickupTest {

    @Test
    public void testCase1() {
        assertThat(new CherryPickup().cherryPickup(new int[][]{{0, 1, -1}, {1, 0, -1}, {1, 1, 1}})).isEqualTo(5);
    }

    @Test
    public void testCase2() {
        assertThat(new CherryPickup().cherryPickup(new int[][]{{1, 1, -1}, {1, -1, 1}, {-1, 1, 1}})).isEqualTo(0);
    }
}
