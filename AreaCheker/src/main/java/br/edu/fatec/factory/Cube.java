package br.edu.fatec.factory;

class Cube implements Calculable {
    private double side;

    public Cube(double side) {
        this.side = side;
    }
    @Override
    public double calcularArea() {
        return 6*( side * side);
    }

}

