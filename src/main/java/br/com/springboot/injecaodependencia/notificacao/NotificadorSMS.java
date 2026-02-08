package br.com.springboot.injecaodependencia.notificacao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import br.com.springboot.injecaodependencia.modelo.Cliente;

@Component
@Primary
public class NotificadorSMS implements Notificador{

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.println("Notificando " + cliente.getNome() + " por SMS: " + mensagem );
    }
}