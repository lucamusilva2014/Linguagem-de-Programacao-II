package br.edu.fatec.factory;

public class Trapezo implements Calculable  {
    private final double base1, base2, height;

    public Trapezo(Double[]values) {
        this.base1 = values[0];
        this.base2 = values[1];
        this.height = values[2];
    }

    @Override
    public double calcularArea() {
        return ((base1 + base2) * height) / 2;
    }
}
