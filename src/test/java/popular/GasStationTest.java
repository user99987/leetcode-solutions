package popular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GasStationTest {

    @Test
    public void testCase1() {
        assertEquals(3, new GasStation().canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}));
    }

    @Test
    public void testCase2() {
        assertEquals(-1, new GasStation().canCompleteCircuit(new int[]{2, 3, 4}, new int[]{3, 4, 3}));
    }
}
