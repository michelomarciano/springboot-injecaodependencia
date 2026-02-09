package br.com.springboot.injecaodependencia.notificacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;


import br.com.springboot.injecaodependencia.modelo.Cliente;

@TipoDoNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificadorEmail implements Notificador {

    //private String host;

    // Ativar quando for testar a classe Nofication Config
    // public NotificadorEmail(String host) {
    //     this.host = host;
    // }

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.println("Notificando " + cliente.getNome() + " por email: " + mensagem );
    }
}   
