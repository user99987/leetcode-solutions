package string

/**
 * Medium
 *
 * Given the initial state of a line of dominoes, return a string representing the final state.
 */
class PushDominoesK {

    fun pushDominoes(dominoes: String): String {
        var r = -1
        var l = -1
        val a = dominoes.toCharArray()
        for (i in a.indices) {
            if (a[i] == 'L') {
                if (r > l) {
                    val d = i - r
                    val st = r + d / 2
                    if ((d % 2) == 0) a[st] = '.'
                    for (j in st + 1 until i) a[j] = 'L'
                } else {
                    for (j in (if (l == -1) 0 else l) until i) a[j] = 'L'
                }
                l = i
            } else if (a[i] == 'R') {
                r = i
            } else if (r > l) {
                a[i] = 'R'
            }
        }
        return String(a)
    }
}

