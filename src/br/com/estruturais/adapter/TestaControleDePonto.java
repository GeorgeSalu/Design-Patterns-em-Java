package br.com.estruturais.adapter;

public class TestaControleDePonto {
    public static void main(String[] args) throws InterruptedException {
        ControleDePonto controleDePonto = new ControleDePontoAdapter();
        Funcionario funcionario = new Funcionario("Marcelo martins");
        controleDePonto.registraEntrada(funcionario);
        Thread.sleep(3000);
        controleDePonto.registraSaida(funcionario);
    }
}
