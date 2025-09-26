package br.edu.fatec.factory;

public class Trapezo  {
    private final double base1, base2, height;

    public Trapezo(Double[] values) {
        this.base1 = values[0];
        this.base2 = values[1];
        this.height = values[2];
    }

    public double calculateArea() {
        return ((base1 + base2) * height) / 2;
    }
}
