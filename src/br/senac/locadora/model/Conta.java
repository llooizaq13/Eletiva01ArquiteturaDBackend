package br.senac.locadora.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Conta {
    private double saldoDevedor;
    private List<Locacao> historicoLocacao;

    public Conta() {
        this.saldoDevedor = 0.0;
        this.historicoLocacao = new ArrayList<>();
    }

    public void locarFilmes(Filme[] filmes) {
        Locacao locacao = new Locacao(new Date());
        for (Filme f : filmes) {
            if (f != null) locacao.addFilme(f);
        }
        historicoLocacao.add(locacao);
        saldoDevedor += locacao.getValorTotalApagar();
    }

    public String extratoHistorico(String nomeCliente) {
        StringBuilder sb = new StringBuilder();
        sb.append(".:: Histórico de Locações de ").append(nomeCliente).append("::.\n");
        for (Locacao loc : historicoLocacao) {
            sb.append(loc.getDataLocacao()).append(" ").append(loc.getListaFilmes())
              .append(" ").append(loc.getValorTotalApagar()).append("\n");
        }
        return sb.toString();
    }

    public void pagarDebito(double valor) {
        saldoDevedor -= valor;
        if (saldoDevedor < 0) saldoDevedor = 0;
    }

    public double getSaldoDevedor() {
        return saldoDevedor;
    }
}
