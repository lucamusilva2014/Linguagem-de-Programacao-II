package edu.fatec.lp2.exercicio1;

public class MsgTexto extends Mensagem {
    private int numChar;

    public MsgTexto(Contatinho destinatario, String conteudo) {
        super(destinatario, conteudo);
        this.numChar = conteudo.length();
    }

    @Override
    public Mensagem sendMessage(String conteudo) {
        System.out.println("Enviando Mensagem...");
        return this;
    }

    @Override
    public String toString() {
        return super.toString() + " | Tipo: Texto | Caracteres: " + numChar;
    }
}
