package br.edu.fatec.factory;

class Parallelogram implements Calculable {
    private final double base, height;

    public Parallelogram(Double[] values) {
        this.base = values[0];
        this.height = values[1];
    }

    @Override
    public double calcularArea() {
        return base * height;
    }

}