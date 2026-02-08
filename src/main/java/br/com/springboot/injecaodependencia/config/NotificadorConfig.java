package br.com.springboot.injecaodependencia.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import br.com.springboot.injecaodependencia.notificacao.Notificador;
import br.com.springboot.injecaodependencia.notificacao.NotificadorEmail;

// Ativar quando for testar o configuration e ativar construtor na classe NotificadorEmail
// @Configuration
// public class NotificadorConfig {
    
//     @Bean
//     public Notificador notificador() {
//         return new NotificadorEmail("smtp.algawork.com.br");
//     }

// }
