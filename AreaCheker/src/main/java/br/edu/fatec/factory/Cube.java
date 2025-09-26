package br.edu.fatec.factory;

class Cube implements Calculable {
    private double side;

    public Cube(Double[] values) {
        this.side = values[0];
    }
    @Override
    public double calcularArea() {
        return 6*( side * side);
    }

}

