package popular

/**
 * Easy
 * Happy Number
 */
class HappyNumberK {

    fun isHappy(nInput: Int): Boolean {
        var n = nInput
        val seen = HashSet<Int>()
        while (n != 1 && !seen.contains(n)) {
            seen.add(n)
            n = getSumOfSquares(n)
        }
        return n == 1
    }

    private fun getSumOfSquares(nInput: Int): Int {
        var n = nInput
        var sum = 0
        while (n > 0) {
            val digit = n % 10
            sum += digit * digit
            n /= 10
        }
        return sum
    }
}

