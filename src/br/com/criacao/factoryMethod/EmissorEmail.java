package br.com.criacao.factoryMethod;

public class EmissorEmail implements Emissor {
    public void enviar(String mensagem) {
        System.out.println("Enviando por email a mensagem");
        System.out.println(mensagem);
    }
}
