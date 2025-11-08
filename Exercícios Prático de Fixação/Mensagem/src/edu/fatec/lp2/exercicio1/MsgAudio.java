package edu.fatec.lp2.exercicio1;

public class MsgAudio extends Mensagem {
    private int duracao;

    public MsgAudio(Contatinho destinatario, String conteudo, int duracao) {
        super(destinatario, conteudo);
        this.duracao = duracao;
    }

    @Override
    public Mensagem sendMessage(String conteudo) {
        System.out.println("Gravando Audio...");
        return this;
    }

    @Override
    public String toString() {
        return super.toString() + " | Tipo: Áudio | Duração: " + duracao + "s";
    }
}
