package br.edu.fatec.factory;

class Hexagon implements Calculable{
    private double side;

    public Hexagon(Double[]values) {
        this.side = values[0];
    }
    @Override
    public double calcularArea() {
       return (3 * Math.sqrt(3) * side * side) / 2;
    }
}