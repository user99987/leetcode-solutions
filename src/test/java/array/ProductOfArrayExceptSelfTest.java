package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ProductOfArrayExceptSelfTest {

    @Test
    public void testCase1() {
        assertThat(new ProductOfArrayExceptSelf().productExceptSelf(new int[]{1, 2, 3, 4})).containsExactly(new int[]{24, 12, 8, 6});
    }

    @Test
    public void testCase2() {
        assertThat(new ProductOfArrayExceptSelf().productExceptSelf(new int[]{-1, 1, 0, -3, 3})).containsExactly(new int[]{0, 0, 9, 0, 0});
    }
}
