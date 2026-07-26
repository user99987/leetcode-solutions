package twopointers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MoveZeroesTest {

    @Test
    public void shouldMoveZeroesToEndPreservingOrder() {
        var nums = new int[]{0, 1, 0, 3, 12};
        new MoveZeroes().moveZeroes(nums);
        assertThat(nums).containsExactly(1, 3, 12, 0, 0);
    }

    @Test
    public void shouldHandleSingleZeroElement() {
        var nums = new int[]{0};
        new MoveZeroes().moveZeroes(nums);
        assertThat(nums).containsExactly(0);
    }

    @Test
    public void shouldLeaveArrayUnchangedWhenNoZeros() {
        var nums = new int[]{1, 2, 3};
        new MoveZeroes().moveZeroes(nums);
        assertThat(nums).containsExactly(1, 2, 3);
    }

    @Test
    public void shouldLeaveArrayUnchangedWhenAllZeros() {
        var nums = new int[]{0, 0, 0};
        new MoveZeroes().moveZeroes(nums);
        assertThat(nums).containsExactly(0, 0, 0);
    }

    @Test
    public void shouldLeaveSingleNonZeroElementUnchanged() {
        var nums = new int[]{5};
        new MoveZeroes().moveZeroes(nums);
        assertThat(nums).containsExactly(5);
    }

    @Test
    public void shouldPreserveOrderWhenZerosAlreadyAtEnd() {
        var nums = new int[]{1, 2, 0, 0};
        new MoveZeroes().moveZeroes(nums);
        assertThat(nums).containsExactly(1, 2, 0, 0);
    }

    @Test
    public void shouldPreserveRelativeOrderForNegativeNumbersWithZeros() {
        var nums = new int[]{0, -1, 0, -2, 3};
        new MoveZeroes().moveZeroes(nums);
        assertThat(nums).containsExactly(-1, -2, 3, 0, 0);
    }
}
