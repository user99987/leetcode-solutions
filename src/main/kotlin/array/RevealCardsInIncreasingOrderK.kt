package array

/**
 * Medium
 *
 * Return an ordering of the deck that would reveal the cards in increasing order.
 */
class RevealCardsInIncreasingOrderK {

    fun deckRevealedIncreasing(deck: IntArray): IntArray {
        deck.sort()
        val n = deck.size
        val queue = ArrayDeque<Int>()
        for (i in 0 until n) {
            queue.add(i)
        }

        val result = IntArray(n)
        for (card in deck) {
            result[queue.removeFirst()] = card
            if (queue.isNotEmpty()) {
                queue.add(queue.removeFirst())
            }
        }

        return result
    }
}

