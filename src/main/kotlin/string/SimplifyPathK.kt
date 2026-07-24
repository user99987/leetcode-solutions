package string

/**
 * Medium
 *
 * Given a string path, an absolute Unix-style path, convert it to the simplified canonical
 * path.
 */
class SimplifyPathK {

    fun simplifyPath(path: String): String {
        val deque = ArrayDeque<String>()
        for (token in path.split("/")) {
            if (token.isEmpty() || token == ".") continue
            if (token == "..") {
                if (deque.isNotEmpty()) deque.removeLast()
            } else {
                deque.addLast(token)
            }
        }

        return "/" + deque.joinToString("/")
    }
}

