package br.edu.fatec.factory;

public class Parallelogram {
    private final double base, height;

    public Parallelogram(Double[] values) {
        this.base = values[0];
        this.height = values[1];
    }

    public double calcularArea() {
        return base * height;
    }

}