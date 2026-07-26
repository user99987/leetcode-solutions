package dynamicprogramming;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RussianDollEnvelopesTest {

    @Test
    public void shouldFindLongestChainOfNestedEnvelopes() {
        assertThat(new RussianDollEnvelopes().maxEnvelopes(new int[][]{{5, 4}, {6, 4}, {6, 7}, {2, 3}})).isEqualTo(3);
    }

    @Test
    public void shouldReturnOneWhenAllEnvelopesAreIdentical() {
        assertThat(new RussianDollEnvelopes().maxEnvelopes(new int[][]{{1, 1}, {1, 1}, {1, 1}})).isEqualTo(1);
    }

}
