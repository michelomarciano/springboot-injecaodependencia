package br.com.springboot.injecaodependencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import br.com.springboot.injecaodependencia.modelo.Cliente;
import br.com.springboot.injecaodependencia.notificacao.Notificador;

@Component
public class AtivacaoClienteService {

    private Notificador notificador;

    @Autowired (required = false)
    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;
    }

    public AtivacaoClienteService (String valor){

    }

   public void ativar(Cliente cliente) {
    cliente.ativar();
    notificador.notificar(cliente, "Cliente ativado com sucesso");
   }

}
