package br.edu.fatec.factory;

class Diamond implements Calculable {
    private double d1,d2;

    public Diamond(Double[] values) {
        this.d1 = values[0];
        this.d2 = values[1];
    }
    @Override
    public double calcularArea() {
        return (d1*d2)/2;
    }

}
