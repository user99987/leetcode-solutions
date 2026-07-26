package greedy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReducingDishesTest {

    @Test
    public void shouldMaximizeSatisfactionByExcludingWorstDishes() {
        assertThat(new ReducingDishes().maxSatisfaction(new int[]{-1, -8, 0, 5, -9})).isEqualTo(14);
    }

    @Test
    public void shouldMaximizeSatisfactionUsingAllPositiveDishes() {
        assertThat(new ReducingDishes().maxSatisfaction(new int[]{4, 3, 2})).isEqualTo(20);
    }

    @Test
    public void shouldReturnZeroWhenAllDishesAreNegative() {
        assertThat(new ReducingDishes().maxSatisfaction(new int[]{-1, -4, -5})).isEqualTo(0);
    }

    @Test
    public void shouldReturnItselfForSinglePositiveDish() {
        assertThat(new ReducingDishes().maxSatisfaction(new int[]{5})).isEqualTo(5);
    }

    @Test
    public void shouldReturnZeroForSingleNegativeDish() {
        assertThat(new ReducingDishes().maxSatisfaction(new int[]{-5})).isEqualTo(0);
    }

    @Test
    public void shouldReturnZeroWhenAllDishesAreZero() {
        assertThat(new ReducingDishes().maxSatisfaction(new int[]{0, 0, 0})).isEqualTo(0);
    }

    @Test
    public void shouldSelectOptimalSubsetForMixedValues() {
        // sorted ascending [-2,-1,0,3,5] with times 1..5: -2*1-1*2+0*3+3*4+5*5 = 33
        assertThat(new ReducingDishes().maxSatisfaction(new int[]{-2, 5, -1, 0, 3})).isEqualTo(33);
    }
}
