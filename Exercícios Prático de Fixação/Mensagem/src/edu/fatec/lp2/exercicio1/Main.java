package edu.fatec.lp2.exercicio1;

public class Main {
    public static void main(String[] args) {
        Contatinho c1 = new Contatinho("Lucas", "1111-1111");
        Contatinho c2 = new Contatinho("Victoria", "2222-2222");

        Mensagem[] msgs = {
                new MsgTexto(c1, "Oi Victoria!").sendMessage("Victoria!"),
                new MsgAudio(c2, "Mensagem de voz", 12).sendMessage("Mensagem de voz"),
                new MsgFoto(c1, "Foto", 450).sendMessage("Foto")
        };

        Whatsapp app = new Whatsapp(new Contatinho[]{c1, c2}, msgs);
        app.listarContatos();
        app.listarMensagens();
    }
}
