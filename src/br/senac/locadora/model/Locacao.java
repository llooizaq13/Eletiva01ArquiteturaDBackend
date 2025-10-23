package br.senac.locadora.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Locacao {
    private Date dataLocacao;
    private List<Filme> listaFilmes;
    private double valorTotalApagar;

    public Locacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
        this.listaFilmes = new ArrayList<>();
        this.valorTotalApagar = 0.0;
    }

    public void addFilme(Filme filme) {
        listaFilmes.add(filme);
        valorTotalApagar += filme.getValorLocacao();
    }

    public Date getDataLocacao() {
        return dataLocacao;
    }

    public List<Filme> getListaFilmes() {
        return listaFilmes;
    }

    public double getValorTotalApagar() {
        return valorTotalApagar;
    }

    @Override
    public String toString() {
        return dataLocacao + " " + listaFilmes + " " + valorTotalApagar;
    }
}
