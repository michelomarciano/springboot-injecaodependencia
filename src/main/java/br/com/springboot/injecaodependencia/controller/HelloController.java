package br.com.springboot.injecaodependencia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.springboot.injecaodependencia.service.AtivacaoClienteService;
import br.com.springboot.injecaodependencia.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;


@Controller
public class HelloController {

    @Autowired
    private AtivacaoClienteService ativacaoClienteService;

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        ativacaoClienteService.ativar(new Cliente("João", "joao@example.com", true));
        return "hello";
    }

}
