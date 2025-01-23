package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HouseRobberTest {

    @Test
    public void testCase1() {
        assertEquals(4, new HouseRobber().rob(new int[]{1, 2, 3, 1}));
    }

    @Test
    public void testCase2() {
        assertEquals(12, new HouseRobber().rob(new int[]{2, 7, 9, 3, 1}));
    }
}

