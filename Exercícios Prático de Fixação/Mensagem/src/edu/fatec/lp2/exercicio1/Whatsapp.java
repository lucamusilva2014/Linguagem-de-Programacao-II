package edu.fatec.lp2.exercicio1;

public class Whatsapp {
    private Contatinho[] contatos;
    private Mensagem[] mensagens;

    public Whatsapp(Contatinho[] contatos, Mensagem[] mensagens) {
        this.contatos = contatos;
        this.mensagens = mensagens;
    }

    public void listarContatos() {
        System.out.println("=== Lista de Contatos ===");
        for (Contatinho c : contatos) {
            System.out.println(c);
        }
    }

    public void listarMensagens() {
        System.out.println("\n=== Lista de Mensagens ===");
        for (Mensagem m : mensagens) {
            System.out.println(m);
        }
    }
}
