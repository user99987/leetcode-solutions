package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ThirdMaximumNumberTest {

    @Test
    public void testCase1() {
        assertThat(new ThirdMaximumNumber().thirdMax(new int[]{3, 2, 1})).isEqualTo(1);
    }

    @Test
    public void testCase2() {
        assertThat(new ThirdMaximumNumber().thirdMax(new int[]{1, 2})).isEqualTo(2);
    }

    @Test
    public void testCase3() {
        assertThat(new ThirdMaximumNumber().thirdMax(new int[]{2, 2, 3, 1})).isEqualTo(1);
    }
}
