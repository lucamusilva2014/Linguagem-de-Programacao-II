package edu.fatec.lp2.exercicio2;

public class Produto {
    private String nome;
    private String unidade;
    private String descricao;
    private double preco;
    private double descontoMaximo;
    private Supermercado supermercado;

    public Produto(String nome, String unidade, String descricao, double preco, double descontoMaximo, Supermercado supermercado) {
        this.nome = nome;
        this.unidade = unidade;
        this.descricao = descricao;
        this.preco = preco;
        this.descontoMaximo = descontoMaximo;
        this.supermercado = supermercado;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getDescontoMaximo() {
        return descontoMaximo;
    }

    public Supermercado getSupermercado() {
        return supermercado;
    }

    @Override
    public String toString() {
        return nome + " (" + descricao + "), R$ " + preco + " por " + unidade + " - Máx Desconto: " + descontoMaximo;
    }
}
