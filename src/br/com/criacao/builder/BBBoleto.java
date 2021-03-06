package br.com.criacao.builder;

import java.util.Calendar;

public class BBBoleto implements Boleto {
    private String sacado;
    private String cedente;
    private double valor;
    private Calendar vencimento;
    private int nossoNumero;

    public BBBoleto(String sacado, String cedente, double valor, Calendar vencimento, int nossoNumero) {
        this.sacado = sacado;
        this.cedente = cedente;
        this.valor = valor;
        this.vencimento = vencimento;
        this.nossoNumero = nossoNumero;
    }

    @Override
    public String getSacado() {
        return this.sacado;
    }

    @Override
    public String getCedente() {
        return this.cedente;
    }

    @Override
    public double getValor() {
        return this.valor;
    }

    @Override
    public Calendar getVencimento() {
        return this.vencimento;
    }

    @Override
    public int getNossoNumero() {
        return this.nossoNumero;
    }

    @Override
    public String toString() {
        return "BBBoleto{" +
               "sacado='" + sacado + '\'' +
               ", cedente='" + cedente + '\'' +
               ", valor=" + valor +
               ", vencimento=" + vencimento +
               ", nossoNumero=" + nossoNumero +
               '}';
    }
}
