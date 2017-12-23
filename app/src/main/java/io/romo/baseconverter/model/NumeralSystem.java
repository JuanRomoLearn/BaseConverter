package io.romo.baseconverter.model;

public enum NumeralSystem {
    Binary(2),
    Decimal(10),
    Octal(8),
    Hexadecimal(16);

    private int radix;

    NumeralSystem(int radix) {
        this.radix = radix;
    }

    public int getRadix() {
        return radix;
    }
}
