package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ProfitableSchemesTest {

    @Test
    public void shouldCountSchemesMeetingMinimumProfit() {
        assertThat(new ProfitableSchemes().profitableSchemes(5, 3, new int[]{2, 2}, new int[]{2, 3})).isEqualTo(2);
    }

    @Test
    public void shouldCountSchemesWithMultipleCrimesAndProfits() {
        assertThat(new ProfitableSchemes().profitableSchemes(10, 5, new int[]{2, 3, 5}, new int[]{6, 7, 8})).isEqualTo(7);
    }

    @Test
    public void shouldCountSingleSchemeWithExactMembersAndProfit() {
        assertThat(new ProfitableSchemes().profitableSchemes(1, 1, new int[]{1}, new int[]{1})).isEqualTo(1);
    }

    @Test
    public void shouldReturnZeroWhenNotEnoughMembersForScheme() {
        assertThat(new ProfitableSchemes().profitableSchemes(1, 1, new int[]{2}, new int[]{1})).isEqualTo(0);
    }

}
