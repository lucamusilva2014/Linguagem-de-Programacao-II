package edu.fatec.lp2.exercicio2;

public class Supermercado {
    private String nome;

    public Supermercado(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Supermercado: " + nome;
    }
}
