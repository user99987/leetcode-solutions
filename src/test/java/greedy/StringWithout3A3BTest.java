package greedy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringWithout3A3BTest {

    @Test
    public void testCase1() {
        var a = 1;
        var b = 2;
        var result = new StringWithout3A3B().strWithout3a3b(a, b);
        assertThat(isValid(result, a, b)).isTrue();
    }

    @Test
    public void testCase2() {
        var a = 4;
        var b = 1;
        var result = new StringWithout3A3B().strWithout3a3b(a, b);
        assertThat(isValid(result, a, b)).isTrue();
    }

    private boolean isValid(String s, int a, int b) {
        var countA = 0;
        var countB = 0;
        for (var c : s.toCharArray()) {
            if (c == 'a') countA++;
            if (c == 'b') countB++;
        }
        return countA == a && countB == b && !s.contains("aaa") && !s.contains("bbb");
    }
}
