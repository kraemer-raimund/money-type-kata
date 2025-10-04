package io.github.kraemerraimund.moneytype;

record Money(long centsAmount) {

    public static Money ofEuros(long eurosAmount) {
        return new Money(eurosAmount * 100);
    }

    public long asCents() {
        return centsAmount;
    }
}
