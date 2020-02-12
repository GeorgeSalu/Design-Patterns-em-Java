package br.com.estruturais.composite;

public class TrecoDeCarro implements Trecho {
    private String direcao;
    private double distancia;

    public TrecoDeCarro(String direcao, double distancia) {
        this.direcao = direcao;
        this.distancia = distancia;
    }

    @Override
    public void imprime() {
        System.out.println("Va de Carro:");
        System.out.println(this.direcao);
        System.out.println("A distancia percorrida sera de : "+this.distancia+" metros");
    }
}
