package array

/**
 * Medium
 *
 * You can swap two digits at most once to get the maximum valued number. Return the maximum
 * valued number you can get.
 */
class MaximumSwapK {

    fun maximumSwap(num: Int): Int {
        val digits = num.toString().toCharArray()

        for (i in digits.indices) {
            var maxIndex = i
            for (j in digits.size - 1 downTo i + 1) {
                if (digits[j] > digits[maxIndex]) maxIndex = j
            }

            if (maxIndex != i) {
                val temp = digits[i]
                digits[i] = digits[maxIndex]
                digits[maxIndex] = temp
                return String(digits).toInt()
            }
        }

        return num
    }
}

