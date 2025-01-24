package string;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

/**
 * Medium
 * <p>
 * Given a string path, which is an absolute path (starting with a slash '/') to a file or directory in a Unix-style file system, convert it to the simplified canonical path.
 * <p>
 * In a Unix-style file system, a period '.' refers to the current directory, a double period '..' refers to the directory up a level, and any multiple consecutive slashes (i.e. '//') are treated as a single slash '/'. For this problem, any other format of periods such as '...' are treated as file/directory names.
 * <p>
 * The canonical path should have the following format:
 * <p>
 * The path starts with a single slash '/'.
 * Any two directories are separated by a single slash '/'.
 * The path does not end with a trailing '/'.
 * The path only contains the directories on the path from the root directory to the target file or directory (i.e., no period '.' or double period '..')
 * Return the simplified canonical path.
 * <p>
 * Example 1:
 * <p>
 * Input: path = "/home/"
 * <p>
 * Output: "/home"
 * <p>
 * Explanation: Note that there is no trailing slash after the last directory name.
 * <p>
 * Example 2:
 * <p>
 * Input: path = "/../"
 * <p>
 * Output: "/"
 * <p>
 * Explanation: Going one level up from the root directory is a no-op, as the root level is the highest level you can go.
 * <p>
 * Example 3:
 * <p>
 * Input: path = "/home//foo/"
 * <p>
 * Output: "/home/foo"
 * <p>
 * Explanation: In the canonical path, multiple consecutive slashes are replaced by a single one.
 * <p>
 * Example 4:
 * <p>
 * Input: path = "/a/./b/../../c/"
 * <p>
 * Output: "/c"
 * <p>
 * Constraints:
 * <p>
 * 1 <= path.length <= 3000
 * path consists of English letters, digits, period '.', slash '/' or '_'.
 * path is a valid absolute Unix path.
 */
public class SimplifyPath {

    public String simplifyPath(String path) {
        if (path == null || path.isEmpty()) return "/";
        StringTokenizer st = new StringTokenizer(path, "/");
        Deque<String> dQueue = new ArrayDeque<>();
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if (token.trim().equals("..")) {
                if (!dQueue.isEmpty()) dQueue.pop();
            } else if (token.trim().equals(".")) {
                // ignore
            } else dQueue.push(token);
        }
        if (dQueue.isEmpty()) return "/";
        StringBuilder finalStr = new StringBuilder();
        while (!dQueue.isEmpty()) {
            finalStr.append("/").append(dQueue.removeLast());
        }
        return finalStr.toString();
    }
}
