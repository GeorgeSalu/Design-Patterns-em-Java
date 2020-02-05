package br.com.criacao.builder;

public class TestaGeradorBoleto {
    public static void main(String[] args) {
        BoletoBuilder boletoBuilder = new BBBoletoBuilder();
        GeradorDeBoleto geradorDeBoleto = new GeradorDeBoleto(boletoBuilder);
        Boleto boleto = geradorDeBoleto.gerarBoleto();
        System.out.println(boleto);
    }
}
