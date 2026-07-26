package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class NextGreaterElementTest {

    @Test
    public void shouldFindNextGreaterElementsForSubsetQuery() {
        assertThat(new NextGreaterElement().nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2})).containsExactly(new int[]{-1, 3, -1});
    }

    @Test
    public void shouldFindNextGreaterElementsForOrderedSubset() {
        assertThat(new NextGreaterElement().nextGreaterElement(new int[]{2, 4}, new int[]{1, 2, 3, 4})).containsExactly(new int[]{3, -1});
    }

    @Test
    public void shouldReturnMinusOneForSingleElementArraysWithNoGreater() {
        assertThat(new NextGreaterElement().nextGreaterElement(new int[]{1}, new int[]{1})).containsExactly(new int[]{-1});
    }

    @Test
    public void shouldReturnAllMinusOneForDecreasingSequence() {
        assertThat(new NextGreaterElement().nextGreaterElement(new int[]{4, 3, 2, 1}, new int[]{4, 3, 2, 1})).containsExactly(new int[]{-1, -1, -1, -1});
    }

    @Test
    public void shouldFindNextGreaterForEachElementInIncreasingSequence() {
        assertThat(new NextGreaterElement().nextGreaterElement(new int[]{1, 2, 3}, new int[]{1, 2, 3, 4})).containsExactly(new int[]{2, 3, 4});
    }

    @Test
    public void shouldHandleQueryElementsInDifferentOrderThanSourceArray() {
        assertThat(new NextGreaterElement().nextGreaterElement(new int[]{2, 1, 4}, new int[]{1, 2, 3, 4})).containsExactly(new int[]{3, 2, -1});
    }
}
