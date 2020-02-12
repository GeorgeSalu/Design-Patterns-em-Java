package br.com.estruturais.composite;

public class TrecoAndando implements Trecho {
    private String direcao;
    private double distancia;

    public TrecoAndando(String direcao, double distancia) {
        this.direcao = direcao;
        this.distancia = distancia;
    }

    @Override
    public void imprime() {
        System.out.println("Va Andando: ");
        System.out.println(this.direcao);
        System.out.println("A distancia percorrida sera de : "+this.distancia+" metros");
    }
}
