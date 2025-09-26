package br.edu.fatec.factory;

class  Circle implements Calculable {
    private double radius;

    public Circle(Double[] values) {
        this.radius = values[0];
    }
    @Override
    public double calcularArea()
    {
        return  3.14 *(radius*radius);
    }
}