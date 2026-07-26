package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BestTimeToBuyAndSellStocksWithFeeTest {

    @Test
    void shouldMaximizeProfitAcrossMultipleTransactionsWithFee() {
        assertThat(new BestTimeToBuyAndSellStocksWithFee().maxProfit(new int[]{1, 3, 2, 8, 4, 9}, 2)).isEqualTo(8);
    }

    @Test
    void shouldMaximizeProfitWithHigherFeeAndDifferentPrices() {
        assertThat(new BestTimeToBuyAndSellStocksWithFee().maxProfit(new int[]{1, 3, 7, 5, 10, 3}, 3)).isEqualTo(6);
    }

}
