package bitmanipulation

/**
 * Easy
 *
 * Given an integer turnedOn which represents the number of LEDs that are currently on, return
 * all possible times the binary watch could represent.
 */
class BinaryWatchK {

    fun readBinaryWatch(num: Int): List<String> {
        val result = ArrayList<String>()
        for (h in 0 until 12) {
            for (m in 0 until 60) {
                if (Integer.bitCount(h) + Integer.bitCount(m) == num) {
                    result.add("$h:${if (m < 10) "0" else ""}$m")
                }
            }
        }
        return result
    }
}

