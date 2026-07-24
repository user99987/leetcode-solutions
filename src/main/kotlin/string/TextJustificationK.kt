package string

/**
 * Hard
 *
 * Format the text such that each line has exactly maxWidth characters and is fully justified,
 * except the last line which is left-justified.
 */
class TextJustificationK {

    fun fullJustify(words: Array<String>, maxWidth: Int): List<String> {
        val result = ArrayList<String>()
        var index = 0

        while (index < words.size) {
            var count = words[index].length
            var last = index + 1

            while (last < words.size && count + words[last].length + (last - index) <= maxWidth) {
                count += words[last].length
                last++
            }

            val spaces = last - index - 1
            val sb = StringBuilder(maxWidth)

            if (last == words.size || spaces == 0) {
                sb.append((index until last).joinToString(" ") { words[it] })
                while (sb.length < maxWidth) {
                    sb.append(' ')
                }
            } else {
                val spaceSize = (maxWidth - count) / spaces
                val extraSpaces = (maxWidth - count) % spaces

                for (i in index until last - 1) {
                    sb.append(words[i])
                    sb.append(" ".repeat(spaceSize + (if (i - index < extraSpaces) 1 else 0)))
                }
                sb.append(words[last - 1])
            }
            result.add(sb.toString())
            index = last
        }
        return result
    }
}

