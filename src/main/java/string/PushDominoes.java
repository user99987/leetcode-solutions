package string;

/**
 * Medium
 * <p>
 * There are n dominoes in a line, and we place each domino vertically upright. In the beginning, we simultaneously push some of the dominoes either to the left or to the right.
 * <p>
 * After each second, each domino that is falling to the left pushes the adjacent domino on the left. Similarly, the dominoes falling to the right push their adjacent dominoes standing on the right.
 * <p>
 * When a vertical domino has dominoes falling on it from both sides, it stays still due to the balance of the forces.
 * <p>
 * For the purposes of this question, we will consider that a falling domino expends no additional force to a falling or already fallen domino.
 * <p>
 * You are given a string dominoes representing the initial state where:
 * <p>
 * dominoes[i] = 'L', if the ith domino has been pushed to the left,
 * dominoes[i] = 'R', if the ith domino has been pushed to the right, and
 * dominoes[i] = '.', if the ith domino has not been pushed.
 * Return a string representing the final state.
 * <p>
 * Example 1:
 * <p>
 * Input: dominoes = "RR.L"
 * <p>
 * Output: "RR.L"
 * <p>
 * Explanation: The first domino expends no additional force on the second domino.
 * <p>
 * Example 2:
 * <p>
 * Input: dominoes = ".L.R…LR..L.."
 * <p>
 * Output: "LL.RR.LLRRLL.."
 * <p>
 * Constraints:
 * <p>
 * n == dominoes.length
 * 1 <= n <= 10^5
 * dominoes[i] is either 'L', 'R', or '.'.
 */
public class PushDominoes {

    public String pushDominoes(String dominoes) {
        int R = -1, L = -1;
        char[] A = dominoes.toCharArray();
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 'L') {
                if (R > L) {
                    int d = (i - R);
                    int st;
                    st = R + d / 2;
                    if ((d % 2) == 0) {
                        A[st] = '.';
                    }
                    for (int j = st + 1; j < i; j++) {
                        A[j] = 'L';
                    }
                } else {
                    for (int j = (L == -1 ? 0 : L); j < i; j++) {
                        A[j] = 'L';
                    }
                }
                L = i;
            } else {
                if (A[i] == 'R') {
                    R = i;
                } else {
                    if (R > L) {
                        A[i] = 'R';
                    }
                }
            }
        }
        return String.valueOf(A);
    }
}
