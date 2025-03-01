package greedy;

/**
 * Medium
 * <p>
 * Given a characters array tasks, representing the tasks a CPU needs to do, where each letter represents a different task. Tasks could be done in any order. Each task is done in one unit of time. For each unit of time, the CPU could complete either one task or just be idle.
 * <p>
 * However, there is a non-negative integer n that represents the cooldown period between two same tasks (the same letter in the array), that is that there must be at least n units of time between any two same tasks.
 * <p>
 * Return the least number of units of times that the CPU will take to finish all the given tasks.
 * <p>
 * Example 1:
 * <p>
 * Input: tasks = ["A","A","A","B","B","B"], n = 2
 * <p>
 * Output: 8
 * <p>
 * Explanation: A -> B -> idle -> A -> B -> idle -> A -> B There is at least 2 units of time between any two same tasks.
 * <p>
 * Example 2:
 * <p>
 * Input: tasks = ["A","A","A","B","B","B"], n = 0
 * <p>
 * Output: 6
 * <p>
 * Explanation: On this case any permutation of size 6 would work since n = 0. ["A","A","A","B","B","B"] ["A","B","A","B","A","B"] ["B","B","B","A","A","A"] … And so on.
 * <p>
 * Example 3:
 * <p>
 * Input: tasks = ["A","A","A","A","A","A","B","C","D","E","F","G"], n = 2
 * <p>
 * Output: 16
 * <p>
 * Explanation: One possible solution is A -> B -> C -> A -> D -> E -> A -> F -> G -> A -> idle -> idle -> A -> idle -> idle -> A
 * <p>
 * Constraints:
 * <p>
 * 1 <= task.length <= 104
 * tasks[i] is upper-case English letter.
 * The integer n is in the range [0, 100].
 */
public class TaskScheduler {

    public int leastInterval(char[] tasks, int n) {
        if (n == 0) {
            return tasks.length;
        }

        int[] frequency = new int[26];
        int maxFreq = 0, maxCount = 0;

        for (char task : tasks) {
            int index = task - 'A';
            frequency[index]++;
            if (frequency[index] > maxFreq) {
                maxFreq = frequency[index];
                maxCount = 1;
            } else if (frequency[index] == maxFreq) {
                maxCount++;
            }
        }

        return Math.max(tasks.length, (maxFreq - 1) * (n + 1) + maxCount);
    }

}
