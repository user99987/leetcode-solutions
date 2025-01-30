package popular;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Easy
 * <p>
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * <p>
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 * <p>
 * Example 1:
 * <p>
 * Input: numRows = 5
 * <p>
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 * <p>
 * Example 2:
 * <p>
 * Input: numRows = 1
 * <p>
 * Output: [[1]]
 * <p>
 * Constraints:
 * <p>
 * 1 <= numRows <= 30
 */
public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();
        IntStream.range(0, numRows).forEach(i -> {
            List<Integer> currRow = IntStream.rangeClosed(0, i)
                    .mapToObj(j -> (j == 0 || j == i) ? 1 : output.get(i - 1).get(j - 1) + output.get(i - 1).get(j))
                    .collect(Collectors.toList());
            output.add(currRow);
        });
        return output;
    }
}
