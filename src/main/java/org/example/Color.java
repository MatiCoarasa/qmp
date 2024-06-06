package org.example;

public class Color {
    private final int red;
    private final int green;
    private final int blue;

    private final int MIN_VALUE = 0;
    private final int MAX_VALUE = 255;

    public Color(int red, int green, int blue) {
        this.red = clamp(red);
        this.green = clamp(green);
        this.blue = clamp(blue);
    }

    private int clamp(int value) {
        return Math.min(MAX_VALUE, Math.max(MIN_VALUE, value));
    }

    private

    @Override
    public String toString() {
        return String.format("%", 2, "s", red) +
                green + blue;
    }
}
