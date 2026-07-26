package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ProductOfArrayExceptSelfTest {

    @Test
    public void shouldComputeProductsForPositiveNumbers() {
        assertThat(new ProductOfArrayExceptSelf().productExceptSelf(new int[]{1, 2, 3, 4})).containsExactly(new int[]{24, 12, 8, 6});
    }

    @Test
    public void shouldComputeProductsWithZeroInArray() {
        assertThat(new ProductOfArrayExceptSelf().productExceptSelf(new int[]{-1, 1, 0, -3, 3})).containsExactly(new int[]{0, 0, 9, 0, 0});
    }

    @Test
    public void shouldSwapElementsForMinimalLengthArray() {
        assertThat(new ProductOfArrayExceptSelf().productExceptSelf(new int[]{3, 5})).containsExactly(new int[]{5, 3});
    }

    @Test
    public void shouldReturnAllZerosWhenMultipleZerosPresent() {
        assertThat(new ProductOfArrayExceptSelf().productExceptSelf(new int[]{0, 0, 2, 3})).containsExactly(new int[]{0, 0, 0, 0});
    }

    @Test
    public void shouldHandleSignsCorrectlyForAllNegativeNumbers() {
        assertThat(new ProductOfArrayExceptSelf().productExceptSelf(new int[]{-1, -2, -3, -4})).containsExactly(new int[]{-24, -12, -8, -6});
    }

    @Test
    public void shouldReturnAllOnesWhenAllElementsAreOne() {
        assertThat(new ProductOfArrayExceptSelf().productExceptSelf(new int[]{1, 1, 1, 1})).containsExactly(new int[]{1, 1, 1, 1});
    }
}
