package popular

/**
 * Medium
 * Palindrome Partitioning
 */
class PalindromePartitioningK {

    fun partition(s: String): List<List<String>> {
        val result = ArrayList<List<String>>()
        backtrack(s, 0, ArrayList(), buildPalindromeTable(s), result)
        return result
    }

    private fun backtrack(s: String, start: Int, partition: MutableList<String>, palindrome: Array<BooleanArray>, result: MutableList<List<String>>) {
        if (start == s.length) {
            result.add(ArrayList(partition))
            return
        }

        for (end in start until s.length) {
            if (!palindrome[start][end]) {
                continue
            }
            partition.add(s.substring(start, end + 1))
            backtrack(s, end + 1, partition, palindrome, result)
            partition.removeAt(partition.size - 1)
        }
    }

    private fun buildPalindromeTable(s: String): Array<BooleanArray> {
        val palindrome = Array(s.length) { BooleanArray(s.length) }
        for (start in s.length - 1 downTo 0) {
            for (end in start until s.length) {
                palindrome[start][end] = s[start] == s[end] &&
                    (end - start < 2 || palindrome[start + 1][end - 1])
            }
        }
        return palindrome
    }
}

