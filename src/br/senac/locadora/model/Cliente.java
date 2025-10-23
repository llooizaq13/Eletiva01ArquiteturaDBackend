package br.senac.locadora.model;

public class Cliente {
    private String nome;
    private Conta conta;

    public Cliente(String nome) {
        this.nome = nome;
        this.conta = new Conta();
    }

    public String getNome() {
        return nome;
    }

    public Conta getConta() {
        return conta;
    }
}
