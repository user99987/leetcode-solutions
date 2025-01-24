package greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoatsToSavePeopleTest {

    @Test
    public void testCase1() {
        assertEquals(1, new BoatsToSavePeople().numRescueBoats(new int[]{1, 2}, 3));
    }

    @Test
    public void testCase2() {
        assertEquals(3, new BoatsToSavePeople().numRescueBoats(new int[]{3, 2, 2, 1}, 3));
    }

    @Test
    public void testCase3() {
        assertEquals(4, new BoatsToSavePeople().numRescueBoats(new int[]{3, 5, 3, 4}, 5));
    }
}

