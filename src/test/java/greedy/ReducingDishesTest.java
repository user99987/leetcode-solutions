package greedy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReducingDishesTest {

    @Test
    public void testCase1() {
        int[] satisfaction = {-1, -8, 0, 5, -9};
        var expected = 14;
        assertThat(new ReducingDishes().maxSatisfaction(satisfaction)).isEqualTo(expected);
    }

    @Test
    public void testCase2() {
        int[] satisfaction = {4, 3, 2};
        var expected = 20;
        assertThat(new ReducingDishes().maxSatisfaction(satisfaction)).isEqualTo(expected);
    }

    @Test
    public void testCase3() {
        int[] satisfaction = {-1, -4, -5};
        var expected = 0;
        assertThat(new ReducingDishes().maxSatisfaction(satisfaction)).isEqualTo(expected);
    }
}
