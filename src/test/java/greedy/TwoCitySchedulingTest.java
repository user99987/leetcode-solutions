package greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoCitySchedulingTest {

    @Test
    public void testCase1() {
        int[][] costs = {{10, 20}, {30, 200}, {400, 50}, {30, 20}};
        int result = new TwoCityScheduling().twoCitySchedCost(costs);
        assertEquals(110, result);
    }

    @Test
    public void testCase2() {
        int[][] costs = {{259, 770}, {448, 54}, {926, 667}, {184, 139}, {840, 118}, {577, 469}};
        int result = new TwoCityScheduling().twoCitySchedCost(costs);
        assertEquals(1859, result);
    }

    @Test
    public void testCase3() {
        int[][] costs = {{515, 563}, {451, 713}, {537, 709}, {343, 819}, {855, 779}, {457, 60}, {650, 359}, {631, 42}};
        int result = new TwoCityScheduling().twoCitySchedCost(costs);
        assertEquals(3086, result);
    }
}
