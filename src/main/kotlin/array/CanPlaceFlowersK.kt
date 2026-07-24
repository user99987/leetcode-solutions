package array

/**
 * Easy
 *
 * Given an integer array flowerbed and an integer n, return if n new flowers can be planted in
 * the flowerbed without violating the no-adjacent-flowers rule.
 */
class CanPlaceFlowersK {

    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var remaining = n
        var i = 0
        while (i < flowerbed.size && remaining > 0) {
            if (flowerbed[i] == 0) {
                val isLeftEmpty = (i == 0) || (flowerbed[i - 1] == 0)
                val isRightEmpty = (i == flowerbed.size - 1) || (flowerbed[i + 1] == 0)

                if (isLeftEmpty && isRightEmpty) {
                    flowerbed[i] = 1
                    remaining--
                }
            }
            i++
        }

        return remaining == 0
    }
}

