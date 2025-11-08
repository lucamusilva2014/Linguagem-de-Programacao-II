package edu.fatec.lp2.exercicio2;

public class ItemCompra implements Calculavel {
    private int quantidade;
    private Produto produto;
    private double desconto; // entre 0 e descontoMaximo

    public ItemCompra(Produto produto, int quantidade, double desconto) {
        if (desconto < 0 || desconto > produto.getDescontoMaximo()) {
            throw new IllegalArgumentException("Desconto inválido! Deve estar entre 0 e " + produto.getDescontoMaximo());
        }
        this.produto = produto;
        this.quantidade = quantidade;
        this.desconto = desconto;
    }

    @Override
    public double calcularPreco() {
        double precoBase = produto.getPreco() * quantidade;
        double valorDesconto = precoBase * (desconto / 100);
        return precoBase - valorDesconto;
    }

    public Produto getProduto() {
        return produto;
    }

    @Override
    public String toString() {
        return quantidade + "x " + produto.getNome() + " (desc. " + desconto + "%) - Total: R$ " + String.format("%.2f", calcularPreco());
    }
}
