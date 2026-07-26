package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MinimumCostForTicketsTest {

    @Test
    public void shouldFindMinimumCostUsingMixOfPasses() {
        assertThat(new MinimumCostForTickets().mincostTickets(
                new int[]{1, 4, 6, 7, 8, 20}, new int[]{2, 7, 15})).isEqualTo(11);
    }

    @Test
    public void shouldFindMinimumCostUsingThirtyDayPass() {
        assertThat(new MinimumCostForTickets().mincostTickets(
                new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 31}, new int[]{2, 7, 15})).isEqualTo(17);
    }
}
