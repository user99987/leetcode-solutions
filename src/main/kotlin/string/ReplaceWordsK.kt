package string

/**
 * Medium
 *
 * Given a dictionary of roots and a sentence, replace all the successors in the sentence with
 * the root forming it (shortest root wins).
 */
class ReplaceWordsK {

    fun replaceWords(dict: List<String>, sentence: String): String {
        val root = Trie()
        dict.forEach { root.insert(it) }
        return sentence.split(" ").joinToString(" ") { word ->
            val replacement = root.find(word)
            replacement.ifEmpty { word }
        }
    }

    class Trie {
        private val map = HashMap<Char?, Trie>()

        fun insert(word: String?) {
            if (word != null) {
                add(0, word, word.length)
            }
        }

        fun find(s: String): String = search(this, s, 0, StringBuilder())

        private fun add(i: Int, word: String, length: Int) {
            if (i < length) {
                val c = word[i]
                val subTrie = map.getOrPut(c) { Trie() }
                subTrie.add(i + 1, word, length)
            } else {
                map[null] = Trie()
            }
        }

        private fun search(curr: Trie, s: String, i: Int, sb: StringBuilder): String {
            if (s.length == i) return sb.toString()
            val subTrie = curr.map[s[i]]
            return if (subTrie == null) {
                if (curr.map.containsKey(null)) sb.toString() else ""
            } else {
                sb.append(s[i])
                if (subTrie.map.containsKey(null)) sb.toString() else search(subTrie, s, i + 1, sb)
            }
        }
    }
}

