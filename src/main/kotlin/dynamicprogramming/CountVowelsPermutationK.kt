package dynamicprogramming

/**
 * Hard
 *
 * Given an integer n, count how many strings of length n can be formed under vowel-adjacency
 * rules, modulo 10^9 + 7.
 */
class CountVowelsPermutationK {

    companion object {
        private const val MOD = 1_000_000_007L
    }

    fun countVowelPermutation(n: Int): Int {
        var a = 1L
        var e = 1L
        var i = 1L
        var o = 1L
        var u = 1L

        for (j in 1 until n) {
            val newA = (e + i + u) % MOD
            val newE = (a + i) % MOD
            val newI = (e + o) % MOD
            val newO = i % MOD
            val newU = (i + o) % MOD

            a = newA
            e = newE
            i = newI
            o = newO
            u = newU
        }
        return ((a + e + i + o + u) % MOD).toInt()
    }
}

