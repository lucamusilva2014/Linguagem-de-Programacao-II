package br.edu.fatec.factory;

public class ShapeFactoryImpl implements ShapeFactory {
    @Override
    public Calculable getShape(ShapeType type, Double[] values) {
        return switch(type) {
            case CIRCLE -> new Circle(values);
            case CUBE -> new Cube(values);
            case DIAMOND -> new Diamond(values);
            case HEXAGON -> new Hexagon(values);
            case PARALLELOGRAM ->new Parallelogram(values);
            case RECTANGLE -> new Rectangle(values);
            case SQUARE -> new Square(values);
            case TRAPEZO -> new Trapezo(values);
            case TRIANGLE -> new Triangle(values);
        };
    }
}

