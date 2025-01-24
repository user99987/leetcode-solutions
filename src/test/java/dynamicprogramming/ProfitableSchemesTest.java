package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProfitableSchemesTest {

    @Test
    public void testCase1() {
        assertEquals(2, new ProfitableSchemes().profitableSchemes(5, 3, new int[]{2, 2}, new int[]{2, 3}));
    }

    @Test
    public void testCase2() {
        assertEquals(7, new ProfitableSchemes().profitableSchemes(10, 5, new int[]{2, 3, 5}, new int[]{6, 7, 8}));
    }

    @Test
    public void testCase3() {
        assertEquals(1, new ProfitableSchemes().profitableSchemes(1, 1, new int[]{1}, new int[]{1}));
    }

    @Test
    public void testCase4() {
        assertEquals(0, new ProfitableSchemes().profitableSchemes(1, 1, new int[]{2}, new int[]{1}));
    }

}
