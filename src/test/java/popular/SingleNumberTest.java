package popular;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class SingleNumberTest {

    @Test
    public void testCase1() {
        assertThat(new SingleNumber().singleNumber(new int[]{2, 2, 1})).isEqualTo(1);
    }

    @Test
    public void testCase2() {
        assertThat(new SingleNumber().singleNumber(new int[]{4, 1, 2, 1, 2})).isEqualTo(4);
    }

    @Test
    public void testCase3() {
        assertThat(new SingleNumber().singleNumber(new int[]{1})).isEqualTo(1);
    }
}
