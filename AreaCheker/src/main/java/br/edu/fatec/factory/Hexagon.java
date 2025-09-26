package br.edu.fatec.factory;

class Hexagon implements Calculable{
    private double side;

    public Hexagon(double side) {
        this.side = side;
    }
    @Override
    public double calcularArea() {
       return (3 * Math.sqrt(3) * side * side) / 2;
    }
}