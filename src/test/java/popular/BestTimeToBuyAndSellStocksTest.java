package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BestTimeToBuyAndSellStocksTest {

    @Test
    void shouldFindMaxProfitWhenPriceRisesAfterDip() {
        assertThat(new BestTimeToBuyAndSellStocks().maxProfit(new int[]{7, 1, 5, 3, 6, 4})).isEqualTo(5);
    }

    @Test
    void shouldReturnZeroWhenPricesAreStrictlyDecreasing() {
        assertThat(new BestTimeToBuyAndSellStocks().maxProfit(new int[]{7, 6, 4, 3, 1})).isEqualTo(0);
    }

}
