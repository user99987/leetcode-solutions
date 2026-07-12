package bitmanipulation;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class BinaryNumberWithAlternatingBitsTest {

    @Test
    public void testCase1() {
        assertThat(new BinaryNumberWithAlternatingBits().hasAlternatingBits(5)).isTrue();
    }

    @Test
    public void testCase2() {
        assertThat(new BinaryNumberWithAlternatingBits().hasAlternatingBits(7)).isFalse();
    }

    @Test
    public void testCase3() {
        assertThat(new BinaryNumberWithAlternatingBits().hasAlternatingBits(11)).isFalse();
    }
}
