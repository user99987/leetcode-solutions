package binarysearch;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SingleElementInASortedArrayTest {

    @Test
    public void testCase1() {
        assertThat(new SingleElementInASortedArray().singleNonDuplicate(new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8})).isEqualTo(2);
    }

    @Test
    public void testCase2() {
        assertThat(new SingleElementInASortedArray().singleNonDuplicate(new int[]{3, 3, 7, 7, 10, 11, 11})).isEqualTo(10);
    }
}
