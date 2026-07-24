package string

/**
 * Medium
 *
 * Given two version numbers, version1 and version2, compare them by comparing revisions in
 * left-to-right order.
 */
class CompareVersionNumbersK {

    fun compareVersion(version1: String, version2: String): Int {
        val v1 = version1.split(".").map { it.toInt() }
        val v2 = version2.split(".").map { it.toInt() }
        val maxLength = maxOf(v1.size, v2.size)

        for (i in 0 until maxLength) {
            val result = (if (i < v1.size) v1[i] else 0).compareTo(if (i < v2.size) v2[i] else 0)
            if (result != 0) return result
        }
        return 0
    }
}

