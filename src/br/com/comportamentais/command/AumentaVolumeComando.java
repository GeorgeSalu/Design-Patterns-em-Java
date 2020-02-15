package br.com.comportamentais.command;

public class AumentaVolumeComando implements Comando {
    private Player player;
    private int levels;

    public AumentaVolumeComando(Player player, int levels) {
        this.player = player;
        this.levels = levels;
    }

    @Override
    public void executa(Player player) {
        this.player.increaseVolume(this.levels);
    }
}
