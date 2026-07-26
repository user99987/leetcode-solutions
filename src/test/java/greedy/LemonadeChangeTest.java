package greedy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LemonadeChangeTest {

    @Test
    public void shouldProvideChangeSuccessfullyForMixedBills() {
        assertThat(new LemonadeChange().lemonadeChange(new int[]{5, 5, 5, 10, 20})).isTrue();
    }

    @Test
    public void shouldFailWhenChangeCannotBeProvided() {
        assertThat(new LemonadeChange().lemonadeChange(new int[]{5, 5, 10, 10, 20})).isFalse();
    }

    @Test
    public void shouldSucceedForSingleFiveDollarBill() {
        assertThat(new LemonadeChange().lemonadeChange(new int[]{5})).isTrue();
    }

    @Test
    public void shouldFailWhenFirstCustomerPaysTen() {
        assertThat(new LemonadeChange().lemonadeChange(new int[]{10})).isFalse();
    }

    @Test
    public void shouldFailWhenFirstCustomerPaysTwenty() {
        assertThat(new LemonadeChange().lemonadeChange(new int[]{20})).isFalse();
    }

    @Test
    public void shouldPreferBreakingTenOverThreeFivesForTwenty() {
        assertThat(new LemonadeChange().lemonadeChange(new int[]{5, 5, 5, 5, 10, 20})).isTrue();
    }

    @Test
    public void shouldFailWhenNotEnoughFivesForMultipleTwenties() {
        // Each $20 bill consumes three $5 bills when no $10 is available; only two can be covered by six $5s
        assertThat(new LemonadeChange().lemonadeChange(new int[]{5, 5, 5, 5, 5, 5, 20, 20, 20})).isFalse();
    }
}
