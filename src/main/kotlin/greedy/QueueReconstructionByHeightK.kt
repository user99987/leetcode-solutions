package greedy

/**
 * Medium
 *
 * Reconstruct and return the queue represented by the input array people, where
 * people[i] = [hi, ki].
 */
class QueueReconstructionByHeightK {

    fun reconstructQueue(people: Array<IntArray>): Array<IntArray> {
        val sorted = people.sortedWith(compareByDescending<IntArray> { it[0] }.thenBy { it[1] })
        val queue = ArrayList<IntArray>()
        for (person in sorted) {
            queue.add(person[1], person)
        }
        return queue.toTypedArray()
    }
}

