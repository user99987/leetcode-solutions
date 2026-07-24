package utils

class ListNodeK @JvmOverloads constructor(@JvmField var value: Int = 0, @JvmField var next: ListNodeK? = null) {

    companion object {
        @JvmStatic
        fun toArray(node: ListNodeK?): IntArray {
            var size = 0
            var current = node
            while (current != null) {
                size++
                current = current.next
            }
            val values = IntArray(size)
            var n = node
            for (i in 0 until size) {
                values[i] = n!!.value
                n = n.next
            }
            return values
        }

        @JvmStatic
        fun create(values: IntArray?): ListNodeK? {
            if (values == null || values.isEmpty()) {
                return null
            }
            val head = ListNodeK(values[0])
            var current = head
            for (i in 1 until values.size) {
                current.next = ListNodeK(values[i])
                current = current.next!!
            }
            return head
        }
    }
}

