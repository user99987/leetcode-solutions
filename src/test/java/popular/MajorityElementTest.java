package popular;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class MajorityElementTest {

    @Test
    public void shouldFindMajorityElementInSmallArray() {
        assertThat(new MajorityElement().majorityElement(new int[]{3, 2, 3})).isEqualTo(3);
    }

    @Test
    public void shouldFindMajorityElementWithMoreThanHalfOccurrences() {
        assertThat(new MajorityElement().majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2})).isEqualTo(2);
    }
}
