package edu.fatec.lp2.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class ListaCompra implements Calculavel {
    private List<ItemCompra> itensCompra;
    private int qtdeMax;

    public ListaCompra(int qtdeMax) {
        this.qtdeMax = qtdeMax;
        this.itensCompra = new ArrayList<>();
    }

    public void incluir(ItemCompra item) {
        if (itensCompra.size() >= qtdeMax) {
            throw new IllegalStateException("Limite de itens atingido!");
        }
        itensCompra.add(item);
    }

    @Override
    public double calcularPreco() {
        double total = 0.0;
        for (ItemCompra item : itensCompra) {
            total += item.calcularPreco();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Lista de Compras:\n");
        for (ItemCompra item : itensCompra) {
            sb.append("- ").append(item).append("\n");
        }
        sb.append("Total da Lista: R$ ").append(String.format("%.2f", calcularPreco()));
        return sb.toString();
    }
}
