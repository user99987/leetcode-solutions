package popular

/**
 * Medium
 * Set Matrix Zeroes
 */
class SetMatrixZeroesK {

    fun setZeroes(matrix: Array<IntArray>) {
        val m = matrix.size
        val n = matrix[0].size
        val firstRowZero = (0 until n).any { matrix[0][it] == 0 }
        val firstColZero = (0 until m).any { matrix[it][0] == 0 }

        for (i in 1 until m) {
            for (j in 1 until n) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0
                    matrix[0][j] = 0
                }
            }
        }

        for (i in 1 until m) {
            if (matrix[i][0] == 0) {
                for (j in 1 until n) matrix[i][j] = 0
            }
        }

        for (j in 1 until n) {
            if (matrix[0][j] == 0) {
                for (i in 1 until m) matrix[i][j] = 0
            }
        }

        if (firstRowZero) for (j in 0 until n) matrix[0][j] = 0
        if (firstColZero) for (i in 0 until m) matrix[i][0] = 0
    }
}

