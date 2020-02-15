package br.com.comportamentais.command;

public class TestaListaDeComandos {
    public static void main(String[] args) {
        Player player = new Player();
        ListaDeComandos listaDeComandos = new ListaDeComandos();

        listaDeComandos.adiciona(new TocaMusicaComando(player, "muais.mp3"));
        listaDeComandos.adiciona(new TocaMusicaComando(player, "muais.mp3"));
        listaDeComandos.adiciona(new AumentaVolumeComando(player, 2));

        listaDeComandos.executa();
    }
}
