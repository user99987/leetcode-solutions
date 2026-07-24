package array

/**
 * Medium
 *
 * Given an array arr of 4 digits, find the latest 24-hour time that can be made using each
 * digit exactly once.
 */
class LargestTimeForGivenDigitsK {

    fun largestTimeFromDigits(digits: IntArray): String {
        var maxTime = -1
        var result = ""

        for (i in 0 until 4) {
            for (j in 0 until 4) {
                if (j == i) continue
                for (k in 0 until 4) {
                    if (k == i || k == j) continue
                    for (l in 0 until 4) {
                        if (l == i || l == j || l == k) continue

                        val hours = digits[i] * 10 + digits[j]
                        val minutes = digits[k] * 10 + digits[l]
                        val total = hours * 60 + minutes

                        if (hours < 24 && minutes < 60 && total > maxTime) {
                            maxTime = total
                            result = String.format("%02d:%02d", hours, minutes)
                        }
                    }
                }
            }
        }

        return if (maxTime == -1) "" else result
    }
}

