package br.com.comportamentais.command;

public class Player {
    public void play(String filename) throws InterruptedException {
        System.out.println("Tocando o arquivo : "+filename);
        long duracao = (long) (Math.random()*2000);
        System.out.println("Duracao (s):"+duracao/1000.0);
        Thread.sleep(duracao);
        System.out.println("fim");
    }
    public void increaseVolume(int levels) {
        System.out.println("Diminuindo o volume em "+levels);
    }

    public void decreaseVolume(int levels) {
        System.out.println("Aumentando o volume em "+levels);
    }
}
