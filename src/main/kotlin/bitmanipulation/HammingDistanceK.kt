package bitmanipulation

/**
 * Easy
 *
 * Given two integers x and y, return the Hamming distance between them.
 */
class HammingDistanceK {

    fun hammingDistance(x: Int, y: Int): Int = Integer.bitCount(x xor y)
}

