package string

/**
 * Easy
 *
 * Return true if and only if s can become goal after some number of left shifts.
 */
class RotateStringK {

    fun rotateString(a: String, b: String): Boolean = a.length == b.length && (a + a).contains(b)
}

