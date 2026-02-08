package br.com.springboot.injecaodependencia.notificacao;

import br.com.springboot.injecaodependencia.modelo.Cliente;


public class NotificadorSMS implements Notificador{

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.println("Notificando " + cliente.getNome() + " por SMS: " + mensagem );
    }
}