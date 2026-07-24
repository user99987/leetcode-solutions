package greedy

/**
 * Medium
 *
 * Return the minimum number of boats to carry every given person, where each boat carries at
 * most two people whose combined weight is at most limit.
 */
class BoatsToSavePeopleK {

    fun numRescueBoats(people: IntArray, limit: Int): Int {
        people.sort()
        var left = 0
        var right = people.size - 1
        var boats = 0

        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++
            }
            right--
            boats++
        }
        return boats
    }
}

