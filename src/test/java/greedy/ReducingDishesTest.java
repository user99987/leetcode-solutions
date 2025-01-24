package greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReducingDishesTest {

    @Test
    public void testCase1() {
        int[] satisfaction = {-1, -8, 0, 5, -9};
        int expected = 14;
        assertEquals(expected, new ReducingDishes().maxSatisfaction(satisfaction));
    }

    @Test
    public void testCase2() {
        int[] satisfaction = {4, 3, 2};
        int expected = 20;
        assertEquals(expected, new ReducingDishes().maxSatisfaction(satisfaction));
    }

    @Test
    public void testCase3() {
        int[] satisfaction = {-1, -4, -5};
        int expected = 0;
        assertEquals(expected, new ReducingDishes().maxSatisfaction(satisfaction));
    }
}
