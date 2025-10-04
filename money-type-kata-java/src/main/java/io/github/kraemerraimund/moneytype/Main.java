package io.github.kraemerraimund.moneytype;

public class Main {

    static void main() {
        // If you're completely new to tests, you might find this more intuitive as a start.
        // But don't get too used to it! This gives you an idea of what it feels like to use
        // your API, but we want tests to be self-verifying.
        IO.println(Money.ofEuros(1).asCents());
    }
}
