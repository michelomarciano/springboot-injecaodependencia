package br.com.springboot.injecaodependencia.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import br.com.springboot.injecaodependencia.notificacao.Notificador;
import br.com.springboot.injecaodependencia.notificacao.NotificacaoEmail;

@Configuration
public class AlgaConfig {
    
    @Bean
    public Notificador notificador() {
        return new NotificacaoEmail("smtp.algawork.com.br");
    }

}
