package br.edu.fatec.factory;

class Triangle implements Calculable{
    private final double base, height;

    public Triangle(Double[] values) {
        this.base = values[0];
        this.height = values[1];
    }

    public double calcularArea() {
        return (base * height) / 2;
    }
}
