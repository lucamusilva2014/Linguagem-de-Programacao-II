package edu.fatec.lp2.exercicio2;

public class Main {
    public static void main(String[] args) {
        Supermercado s = new Supermercado("Astolfão");
        Produto p1 = new Produto("Leite", "L", "Leite Integral", 5.50, 5, s);
        Produto p2 = new Produto("Oleo", "L", "Oleo de Milho", 8.90, 10, s);
        Produto p3 = new Produto("Trigo", "Kg", "Farinha de Trigo", 4.90, 5, s);
        Produto p4 = new Produto("Açucar", "Kg", "Açucar Cristal", 6.90, 10, s);

        ItemCompra i1 = new ItemCompra(p1, 3, 5);
        ItemCompra i2 = new ItemCompra(p2, 2, 0);
        ItemCompra i3 = new ItemCompra(p3, 5, 5);
        ItemCompra i4 = new ItemCompra(p4, 7, 10);

        ListaCompra lista = new ListaCompra(5);
        lista.incluir(i1);
        lista.incluir(i2);
        lista.incluir(i3);
        lista.incluir(i4);

        System.out.println(lista);
    }
}
