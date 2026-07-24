package dynamicprogramming

/**
 * Hard
 *
 * Return the largest multiple of three that can be formed by concatenating some of the given
 * digits in any order, as a string.
 */
class LargestMultipleOfThreeK {

    fun largestMultipleOfThree(digits: IntArray): String {
        var sum = 0
        val count = IntArray(10)
        for (x in digits) {
            sum += x
            count[x]++
        }
        val sb = StringBuilder()
        var copied = count.copyOf()

        if (sum % 3 != 0) {
            var rem = sum % 3
            var oldRem = rem
            while (oldRem != 0) {
                while (rem != 0) {
                    copied[rem % 10]--
                    if (copied[rem % 10] < 0) {
                        oldRem += 3
                        rem = oldRem
                        copied = count.copyOf()
                        break
                    }
                    rem /= 10
                    if (rem == 0) oldRem = 0
                }
            }
        }
        for (i in 9 downTo 0) {
            while (copied[i]-- > 0) {
                sb.append(i)
            }
        }
        while (sb.length > 1 && sb[0] == '0') {
            sb.deleteCharAt(0)
        }
        return sb.toString()
    }
}

