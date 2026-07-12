package tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;


public class MinimumAbsoluteDifferenceInBSTTest {

    @Test
    public void testCase1() {
        int actual = new MinimumAbsoluteDifferenceInBST().minAbsoluteDifference(
                List.of(4, 3, 2, 4),
                2
        );
        assertThat(actual).isEqualTo(0);
    }

    @Test
    public void testCase2() {
        int actual = new MinimumAbsoluteDifferenceInBST().minAbsoluteDifference(
                List.of(5, 3, 2, 10, 15),
                1
        );
        assertThat(actual).isEqualTo(1);
    }

    @Test
    public void testCase3() {
        int actual = new MinimumAbsoluteDifferenceInBST().minAbsoluteDifference(
                List.of(1, 2, 3, 4),
                3
        );
        assertThat(actual).isEqualTo(3);
    }
}
