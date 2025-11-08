package edu.fatec.lp2.exercicio1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Mensagem {
    private Contatinho destinatario;
    private String horaEnvio;
    private String conteudo;

    public Mensagem(Contatinho destinatario, String conteudo) {
        this.destinatario = destinatario;
        this.conteudo = conteudo;
        this.horaEnvio = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }

    public Contatinho getDestinatario() {
        return destinatario;
    }

    public String getHoraEnvio() {
        return horaEnvio;
    }

    public String getConteudo() {
        return conteudo;
    }

    public abstract Mensagem sendMessage(String conteudo);

    @Override
    public String toString() {
        return "Para: " + destinatario.getNome() +
                " | Enviado às: " + horaEnvio +
                " | Conteúdo: " + conteudo;
    }
}
