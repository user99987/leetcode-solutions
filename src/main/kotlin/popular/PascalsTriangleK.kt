package popular

/**
 * Easy
 * Pascal's Triangle
 */
class PascalsTriangleK {

    fun generate(numRows: Int): List<List<Int>> {
        val output = ArrayList<List<Int>>()
        for (i in 0 until numRows) {
            val currRow = (0..i).map { j ->
                if (j == 0 || j == i) 1 else output[i - 1][j - 1] + output[i - 1][j]
            }
            output.add(currRow)
        }
        return output
    }
}

