package br.senac.locadora.app;

import br.senac.locadora.model.*;

public class Principal {
    public static void main(String[] args) {
        Filme[] filmesBase = {
            new Filme("A Viagem", 5.5),
            new Filme("Caramelo", 6.0),
            new Filme("Interestelar", 8.1),
            new Filme("Vingadores: A vingança", 8.3),
            new Filme("Titanic", 4.5),
            new Filme("Gladiador 2", 5.5),
            new Filme("Batman", 7.5),
            new Filme("Procurando Nemo", 4.5),
            new Filme("O Encantor", 6.0),
            new Filme("Telefone Preto", 5.0)
        };

        Cliente[] clientes = {
            new Cliente("Ana Ruthe"),
            new Cliente("João Henrique"),
            new Cliente("Ana Clara"),
            new Cliente("Carlos Eduardo"),
            new Cliente("Maria Fernanda")
        };

        clientes[0].getConta().locarFilmes(new Filme[]{filmesBase[0], filmesBase[1], filmesBase[2]});
        clientes[0].getConta().locarFilmes(new Filme[]{filmesBase[4], filmesBase[5]});
        clientes[1].getConta().locarFilmes(new Filme[]{filmesBase[3], filmesBase[6]});
        clientes[2].getConta().locarFilmes(new Filme[]{filmesBase[7], filmesBase[8]});
        clientes[3].getConta().locarFilmes(new Filme[]{filmesBase[0], filmesBase[9]});
        clientes[4].getConta().locarFilmes(new Filme[]{filmesBase[2], filmesBase[5], filmesBase[8]});

        for (Cliente c : clientes) {
            System.out.println(c.getConta().extratoHistorico(c.getNome()));
        }
    }
}
