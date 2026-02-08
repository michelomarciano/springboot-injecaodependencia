package br.com.springboot.injecaodependencia.modelo;

public class Cliente {
    private String nome;
    private String email;
    private boolean ativo;

    public Cliente(String nome, String email, boolean ativo) {
        this.nome = nome;
        this.email = email;
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void ativar() {
        this.ativo = true;
    }

    public boolean isAtivo() {
        return ativo;
    }

}
