package br.edu.fatec.main;

import br.edu.fatec.factory.Calculable;
import br.edu.fatec.factory.ShapeFactory;
import br.edu.fatec.factory.ShapeFactoryImpl;
import br.edu.fatec.factory.ShapeType;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory=new ShapeFactoryImpl();
        Calculable square= factory.getShape(ShapeType.SQUARE, new Double[]{5.0});
        System.out.println("Área do Quadrado: " + square.calcularArea());

        Calculable circle= factory.getShape(ShapeType.CIRCLE, new Double[]{5.0});
        System.out.println("Area do Circulo: " + circle.calcularArea());

        Calculable cube= factory.getShape(ShapeType.CUBE, new Double[]{5.0});
        System.out.println("Area do Cubo: " + cube.calcularArea());

        Calculable diamond= factory.getShape(ShapeType.DIAMOND, new Double[]{10.0, 5.0});
        System.out.println("Area do Losango: " + diamond.calcularArea());

        Calculable hexagon= factory.getShape(ShapeType.HEXAGON, new Double[]{5.0});
        System.out.println("Area do Hexagono: " + hexagon.calcularArea());

        Calculable parallelogram= factory.getShape(ShapeType.PARALLELOGRAM, new Double[]{5.0, 4.0});
        System.out.println("Area do Paralelograma: " + parallelogram.calcularArea());

        Calculable Rectangle= factory.getShape(ShapeType.RECTANGLE, new Double[]{5.0, 6.0});
        System.out.println("Area do Rectangle: " + Rectangle.calcularArea());

        Calculable trapezo= factory.getShape(ShapeType.TRAPEZO, new Double[]{6.0, 5.0,4.0});
        System.out.println("Area do Trapezo: " + trapezo.calcularArea());
        }

    }

