package br.com.springboot.injecaodependencia.notificacao;

import br.com.springboot.injecaodependencia.modelo.Cliente;

public interface Notificador {

    void notificar(Cliente cliente, String mensagem);

}
