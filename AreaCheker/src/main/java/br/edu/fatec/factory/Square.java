package br.edu.fatec.factory;

class Square implements Calculable {
    private double side;

    public Square(Double[] values) {
        this.side = values[0];
    }
    @Override
    public double calcularArea() {
        return side * side;
    }

}

