package io.github.kraemerraimund.moneytype;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MoneyTest {

    // Treat the tests as an executable specification.
    // Uncomment the tests one by one. Make each one pass with the simplest implementation,
    // then refactor while keeping all tests passing.
    // For each test, think about whether you would have thought of it yourself and whether
    // you would have added them in the same order.

    /*
    @Test
    @DisplayName("1 Euro = 100 cents")
    void oneEuroConsistsOf100Cents() {
        var oneEuro = Money.ofEuros(1);
        assertThat(oneEuro.asCents()).isEqualTo(100);
    }

    @Test
    @DisplayName("can be negative")
    void canBeNegative() {
        var euros = Money.ofEuros(-1);
        assertThat(euros.asCents()).isEqualTo(-100);
    }

    @ParameterizedTest
    @CsvSource({
            "0, 0, 0",
            "13, 37, 1337",
            "1_000_000, 20, 100_000_020",
            "-11, -11, -1111",
    })
    @DisplayName("1 Euro = 100 cents")
    void canConsistOfEurosAndCents(int euros, int cents, int expectedTotalCents) {
        var money = Money.ofEurosAndCents(euros, cents);
        assertThat(money.asCents()).isEqualTo(expectedTotalCents);
    }

    @Test
    @DisplayName("euros and cents cannot have different signs")
    void eurosAndCentsCannotHaveDifferentSigns() {
        assertThatExceptionOfType(MoneyException.class)
                .isThrownBy(() -> Money.ofEurosAndCents(1, -1));
    }

    @Test
    @DisplayName("cents must not overflow")
    void centsMustNotOverflow() {
        // This is a design decision. We could also gracefully handle overflowing cents, treating
        // 1 euro and 100 cents as 2 euros, but that would create a potential source of bugs.
        assertThatExceptionOfType(MoneyException.class).isThrownBy(
                () -> Money.ofEurosAndCents(1, 100));
        assertThatNoException().isThrownBy(
                () -> Money.ofEurosAndCents(1, 99));
    }

    @Test
    @DisplayName("same currency can be compared")
    void sameCurrencyCanBeCompared() {
        assertThat(Money.ofEuros(2)).isEqualTo(Money.ofEuros(2));
        assertThat(Money.ofEuros(3)).isGreaterThan(Money.ofEuros(2));
        assertThat(Money.ofEuros(0)).isLessThan(Money.ofEuros(1));
    }

    @Test
    @DisplayName("different currencies cannot be compared")
    void differentCurrenciesCannotBeCompared() {
        assertThatExceptionOfType(MoneyException.class).isThrownBy(() -> {
            var _ = Money.ofEuros(1).compareTo(Money.ofDollars(1));
        });
    }
    */
}
