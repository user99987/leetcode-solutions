package popular

import java.util.LinkedList

/**
 * Easy
 * Min Stack
 */
class MinStackK {
    private val stack = LinkedList<IntArray>()

    fun push(x: Int) {
        stack.push(intArrayOf(x, if (stack.isEmpty()) x else minOf(stack.peek()[1], x)))
    }

    fun pop() {
        stack.pop()
    }

    fun top(): Int {
        return stack.peek()[0]
    }

    fun getMin(): Int {
        return stack.peek()[1]
    }
}

