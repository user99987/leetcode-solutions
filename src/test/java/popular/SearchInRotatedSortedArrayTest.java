package popular;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class SearchInRotatedSortedArrayTest {

    @Test
    public void testCase1() {
        assertThat(new SearchInRotatedSortedArray().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0)).isEqualTo(4);
    }

    @Test
    public void testCase2() {
        assertThat(new SearchInRotatedSortedArray().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3)).isEqualTo(-1);
    }

    @Test
    public void testCase3() {
        assertThat(new SearchInRotatedSortedArray().search(new int[]{1}, 0)).isEqualTo(-1);
    }
}
