package popular

/**
 * Hard
 * Max Points on a Line
 */
class MaxPointsOnLineK {

    fun maxPoints(points: Array<IntArray>): Int {
        var best = 0
        for (i in 0 until points.size - 1) {
            val map = HashMap<Double, Int>()
            var localMax = 0
            for (j in i + 1 until points.size) {
                val slope = calculateSlope(points[i], points[j])
                val count = map.merge(slope, 1) { a, b -> a + b }!!
                localMax = maxOf(localMax, count)
            }
            best = maxOf(best, localMax)
        }
        return best + 1
    }

    private fun calculateSlope(p1: IntArray, p2: IntArray): Double {
        val y = (p2[1] - p1[1]).toDouble()
        val x = (p2[0] - p1[0]).toDouble()
        return if (x == 0.0) Double.POSITIVE_INFINITY else if (y == 0.0) 0.0 else y / x
    }
}

