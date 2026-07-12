package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MissingNumberTest {

    @Test
    public void testCase1() {
        assertThat(new MissingNumber().missingNumber(new int[]{3, 0, 1})).isEqualTo(2);
    }

    @Test
    public void testCase2() {
        assertThat(new MissingNumber().missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1})).isEqualTo(8);
    }

    @Test
    public void testCase3() {
        assertThat(new MissingNumber().missingNumber(new int[]{0})).isEqualTo(1);
    }
}
