import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MoneyTest {

    @Test
    void passes() {
        assertThat("Hello, world!").isNotEmpty();
    }

    @Test
    void fails() {
        assertThat("42").isEqualTo("answer");
    }
}
