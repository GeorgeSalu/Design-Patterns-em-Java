package br.com.criacao.factoryMethod;

public class EmissorSMS implements Emissor {
    @Override
    public void enviar(String mensagem) {
        System.out.println("enviando por SMS a mensagem: ");
        System.out.println(mensagem);
    }
}
