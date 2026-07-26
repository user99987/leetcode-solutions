package binarysearch;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SingleElementInASortedArrayTest {

    @Test
    public void shouldFindSingleElementInMiddleOfArray() {
        assertThat(new SingleElementInASortedArray().singleNonDuplicate(new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8})).isEqualTo(2);
    }

    @Test
    public void shouldFindSingleElementAmongPairs() {
        assertThat(new SingleElementInASortedArray().singleNonDuplicate(new int[]{3, 3, 7, 7, 10, 11, 11})).isEqualTo(10);
    }

    @Test
    public void shouldReturnElementForSingleElementArray() {
        assertThat(new SingleElementInASortedArray().singleNonDuplicate(new int[]{7})).isEqualTo(7);
    }

    @Test
    public void shouldReturnFirstElementWhenUniqueValueIsAtStart() {
        assertThat(new SingleElementInASortedArray().singleNonDuplicate(new int[]{1, 2, 2, 3, 3})).isEqualTo(1);
    }

    @Test
    public void shouldReturnLastElementWhenUniqueValueIsAtEnd() {
        assertThat(new SingleElementInASortedArray().singleNonDuplicate(new int[]{1, 1, 2, 2, 3})).isEqualTo(3);
    }

    @Test
    public void shouldReturnMiddleElementForThreeElementArray() {
        assertThat(new SingleElementInASortedArray().singleNonDuplicate(new int[]{1, 5, 5})).isEqualTo(1);
    }
}
