package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ProfitableSchemesTest {

    @Test
    public void testCase1() {
        assertThat(new ProfitableSchemes().profitableSchemes(5, 3, new int[]{2, 2}, new int[]{2, 3})).isEqualTo(2);
    }

    @Test
    public void testCase2() {
        assertThat(new ProfitableSchemes().profitableSchemes(10, 5, new int[]{2, 3, 5}, new int[]{6, 7, 8})).isEqualTo(7);
    }

    @Test
    public void testCase3() {
        assertThat(new ProfitableSchemes().profitableSchemes(1, 1, new int[]{1}, new int[]{1})).isEqualTo(1);
    }

    @Test
    public void testCase4() {
        assertThat(new ProfitableSchemes().profitableSchemes(1, 1, new int[]{2}, new int[]{1})).isEqualTo(0);
    }

}
