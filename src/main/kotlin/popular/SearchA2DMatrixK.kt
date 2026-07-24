package popular

/**
 * Medium
 * Search a 2D Matrix
 */
class SearchA2DMatrixK {

    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        if (matrix.isEmpty()) return false
        val rows = matrix.size
        val cols = matrix[0].size
        var left = 0
        var right = rows * cols - 1

        while (left <= right) {
            val mid = left + (right - left) / 2
            val midValue = matrix[mid / cols][mid % cols]

            if (midValue == target) return true
            else if (midValue < target) left = mid + 1
            else right = mid - 1
        }

        return false
    }
}

