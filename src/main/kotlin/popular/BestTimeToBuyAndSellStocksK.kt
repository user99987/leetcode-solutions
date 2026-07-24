package popular

/**
 * Easy
 * Best Time to Buy and Sell Stock
 */
class BestTimeToBuyAndSellStocksK {

    fun maxProfit(prices: IntArray): Int {
        var minPrice = prices[0]
        var maxProfit = 0

        for (i in 1 until prices.size) {
            minPrice = minOf(minPrice, prices[i])
            maxProfit = maxOf(maxProfit, prices[i] - minPrice)
        }

        return maxProfit
    }
}

