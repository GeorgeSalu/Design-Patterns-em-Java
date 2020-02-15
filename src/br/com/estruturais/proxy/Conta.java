package br.com.estruturais.proxy;

public interface Conta {
    void deposita(double valor);
    void saca(double valor);
    double getSaldo();
}