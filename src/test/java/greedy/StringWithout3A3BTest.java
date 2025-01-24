package greedy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringWithout3A3BTest {

    @Test
    public void testCase1() {
        int a = 1, b = 2;
        String result = new StringWithout3A3B().strWithout3a3b(a, b);
        assertTrue(isValid(result, a, b));
    }

    @Test
    public void testCase2() {
        int a = 4, b = 1;
        String result = new StringWithout3A3B().strWithout3a3b(a, b);
        assertTrue(isValid(result, a, b));
    }

    private boolean isValid(String s, int a, int b) {
        int countA = 0, countB = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a') countA++;
            if (c == 'b') countB++;
        }
        return countA == a && countB == b && !s.contains("aaa") && !s.contains("bbb");
    }
}
