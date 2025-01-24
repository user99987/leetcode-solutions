package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChampagneTowerTest {

    @Test
    public void testCase1() {
        assertEquals(0.0, new ChampagneTower().champagneTower(1, 1, 1), 0.00001);
    }

    @Test
    public void testCase2() {
        assertEquals(0.5, new ChampagneTower().champagneTower(2, 1, 1), 0.00001);
    }

    @Test
    public void testCase3() {
        assertEquals(1.0, new ChampagneTower().champagneTower(100000009, 33, 17), 0.00001);
    }
}
