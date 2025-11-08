package edu.fatec.lp2.exercicio1;

public class MsgFoto extends Mensagem {
    private int tamanho; // em KB

    public MsgFoto(Contatinho destinatario, String conteudo, int tamanho) {
        super(destinatario, conteudo);
        this.tamanho = tamanho;
    }

    @Override
    public Mensagem sendMessage(String conteudo) {
        System.out.println("Enviando Foto...");
        return this;
    }

    @Override
    public String toString() {
        return super.toString() + " | Tipo: Foto | Tamanho: " + tamanho + "KB";
    }
}
