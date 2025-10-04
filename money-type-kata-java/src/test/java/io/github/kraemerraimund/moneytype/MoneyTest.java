package io.github.kraemerraimund.moneytype;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MoneyTest {

    @Test
    @DisplayName("1 Euro = 100 cents")
    void oneEuroConsistsOf100Cents() {
        var euros = Money.ofEuros(1);
        assertThat(euros.asCents()).isEqualTo(100);
    }
}
