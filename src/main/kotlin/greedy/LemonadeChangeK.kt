package greedy

/**
 * Easy
 *
 * Given an integer array bills where bills[i] is the bill the ith customer pays, return true if
 * you can provide every customer with the correct change, or false otherwise.
 */
class LemonadeChangeK {

    fun lemonadeChange(bills: IntArray): Boolean {
        var five = 0
        var ten = 0

        for (bill in bills) {
            if (bill == 5) {
                five++
            } else if (bill == 10) {
                if (five == 0) {
                    return false
                }
                five--
                ten++
            } else {
                if (ten > 0 && five > 0) {
                    ten--
                    five--
                } else if (five >= 3) {
                    five -= 3
                } else {
                    return false
                }
            }
        }
        return true
    }
}

