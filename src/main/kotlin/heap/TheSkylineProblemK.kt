package heap

import java.util.TreeMap

/**
 * Hard
 *
 * Given the locations and heights of all the buildings, return the skyline formed by these
 * buildings collectively.
 */
class TheSkylineProblemK {

    fun getSkyline(buildings: Array<IntArray>): List<List<Int>> {
        val events = ArrayList<IntArray>()
        for (building in buildings) {
            events.add(intArrayOf(building[0], building[2]))
            events.add(intArrayOf(building[1], -building[2]))
        }
        events.sortWith(compareBy({ it[0] }, { -it[1] }))

        val skyline = ArrayList<List<Int>>()
        val heightMap = TreeMap<Int, Int>()
        heightMap[0] = 1
        var prevHeight = 0

        for (event in events) {
            if (event[1] > 0) {
                heightMap[event[1]] = heightMap.getOrDefault(event[1], 0) + 1
            } else {
                val count = heightMap[-event[1]]!!
                if (count == 1) {
                    heightMap.remove(-event[1])
                } else {
                    heightMap[-event[1]] = count - 1
                }
            }

            val currentHeight = heightMap.lastKey()
            if (currentHeight != prevHeight) {
                skyline.add(listOf(event[0], currentHeight))
                prevHeight = currentHeight
            }
        }
        return skyline
    }
}

