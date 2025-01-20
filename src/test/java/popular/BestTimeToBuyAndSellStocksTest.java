package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class BestTimeToBuyAndSellStocksTest {

    @Test
    void testCase1() {
        assertThat(new BestTimeToBuyAndSellStocks().maxProfit(new int[]{7, 1, 5, 3, 6, 4})).isEqualTo(5);
    }

    @Test
    void testCase2() {
        assertThat(new BestTimeToBuyAndSellStocks().maxProfit(new int[]{7, 6, 4, 3, 1})).isEqualTo(0);
    }

}
