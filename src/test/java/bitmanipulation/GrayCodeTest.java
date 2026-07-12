package bitmanipulation;

import org.junit.jupiter.api.Test;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class GrayCodeTest {

    @Test
    public void testCase1() {
        var result = new GrayCode().grayCode(2);
        assertThat(result).isEqualTo(List.of(0, 1, 3, 2));
    }

    @Test
    public void testCase2() {
        var result = new GrayCode().grayCode(1);
        assertThat(result).isEqualTo(List.of(0, 1));
    }
}
