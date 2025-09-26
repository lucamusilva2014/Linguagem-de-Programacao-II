package br.edu.fatec.factory;

public class Rectangle {
    private final double base, height;

    public Rectangle(Double[] values) {
        this.base = values[0];
        this.height = values[1];
    }

    public double calculateArea() {
        return base * height;
    }
}
