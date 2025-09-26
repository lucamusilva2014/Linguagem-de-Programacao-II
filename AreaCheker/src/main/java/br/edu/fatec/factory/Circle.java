package br.edu.fatec.factory;

class  Circle implements Calculable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double calcularArea()
    {
        return  3.14 *(radius*radius);
    }
}