package greedy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TwoCitySchedulingTest {

    @Test
    public void shouldMinimizeCostForFourPeopleExample() {
        int[][] costs = {{10, 20}, {30, 200}, {400, 50}, {30, 20}};
        assertThat(new TwoCityScheduling().twoCitySchedCost(costs)).isEqualTo(110);
    }

    @Test
    public void shouldMinimizeCostForSixPeopleExample() {
        int[][] costs = {{259, 770}, {448, 54}, {926, 667}, {184, 139}, {840, 118}, {577, 469}};
        assertThat(new TwoCityScheduling().twoCitySchedCost(costs)).isEqualTo(1859);
    }

    @Test
    public void shouldMinimizeCostForEightPeopleExample() {
        int[][] costs = {{515, 563}, {451, 713}, {537, 709}, {343, 819}, {855, 779}, {457, 60}, {650, 359}, {631, 42}};
        assertThat(new TwoCityScheduling().twoCitySchedCost(costs)).isEqualTo(3086);
    }

    @Test
    public void shouldSendOnePersonToEachCityForMinimalCase() {
        int[][] costs = {{10, 20}, {30, 5}};
        assertThat(new TwoCityScheduling().twoCitySchedCost(costs)).isEqualTo(15);
    }

    @Test
    public void shouldSumAllCostsWhenAllCostsAreEqual() {
        int[][] costs = {{10, 10}, {10, 10}};
        assertThat(new TwoCityScheduling().twoCitySchedCost(costs)).isEqualTo(20);
    }
}
