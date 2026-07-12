package array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class RelativeRanksTest {

    @Test
    public void testCase1() {
        assertThat(new RelativeRanks().findRelativeRanks(new int[]{5, 4, 3, 2, 1})).containsExactly(new String[]{"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"});
    }

    @Test
    public void testCase2() {
        assertThat(new RelativeRanks().findRelativeRanks(new int[]{10, 3, 8, 9, 4})).containsExactly(new String[]{"Gold Medal", "5", "Bronze Medal", "Silver Medal", "4"});
    }
}
