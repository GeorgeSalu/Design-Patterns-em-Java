package br.com.comportamentais.command;

public class DiminuiVolumeComando implements Comando {
    private Player player;
    private int levels;

    public DiminuiVolumeComando(Player player, int levels) {
        this.player = player;
        this.levels = levels;
    }

    @Override
    public void executa(Player player) {
        this.player.decreaseVolume(this.levels);
    }
}
