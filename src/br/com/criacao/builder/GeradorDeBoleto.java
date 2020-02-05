package br.com.criacao.builder;

import java.util.Calendar;

public class GeradorDeBoleto {
    private BoletoBuilder boletoBuilder;

    public GeradorDeBoleto(BoletoBuilder boletoBuilder) {
        this.boletoBuilder = boletoBuilder;
    }

    public Boleto gerarBoleto() {
        this.boletoBuilder.buildSacado("Marcelo Martins");
        this.boletoBuilder.buildCedente("k19 - treinamentos");
        this.boletoBuilder.buildValor(100.54);

        Calendar vencimento = Calendar.getInstance();
        vencimento.add(Calendar.DATE, 30);
        this.boletoBuilder.buildVencimento(vencimento);

        this.boletoBuilder.buildNossoNumero(123);
        Boleto boleto = boletoBuilder.getBoleto();
        return boleto;
    }
}