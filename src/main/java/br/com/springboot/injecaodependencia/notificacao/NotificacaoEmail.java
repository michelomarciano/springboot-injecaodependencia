package br.com.springboot.injecaodependencia.notificacao;

import br.com.springboot.injecaodependencia.modelo.Cliente;

public class NotificacaoEmail implements Notificador {

    private String host;

    public NotificacaoEmail(String host) {
        this.host = host;
    }

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.println("Notificando " + cliente.getNome() + " por email: " + mensagem + " no host: " + host);
    }
}   
