package br.com.estruturais.bridge;

public class TestaRecibo {
    public static void main(String[] args) {
        GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivoTXT();
        Recibo recibo = new Recibo("K19 treinamentos", "Marcelo martins", 100, geradorDeArquivo);
        recibo.gerarArquivo();
    }
}
