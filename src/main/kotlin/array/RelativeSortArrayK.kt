package array

/**
 * Easy
 *
 * Sort the elements of arr1 such that the relative ordering of items in arr1 is the same as in
 * arr2. Elements that do not appear in arr2 are placed at the end of arr1 in ascending order.
 */
class RelativeSortArrayK {

    fun relativeSortArray(arr1: IntArray, arr2: IntArray): IntArray {
        val map = IntArray(1001)
        for (a in arr1) {
            map[a]++
        }
        var i = 0
        for (b in arr2) {
            while (map[b] != 0) {
                map[b]--
                arr1[i++] = b
            }
        }
        for (j in map.indices) {
            while (map[j] != 0) {
                arr1[i++] = j
                map[j]--
            }
        }
        return arr1
    }
}

