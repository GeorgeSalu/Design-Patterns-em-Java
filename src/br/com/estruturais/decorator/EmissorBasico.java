package br.com.estruturais.decorator;

public class EmissorBasico implements Emissor{
    @Override
    public void envia(String mensagem) {
        System.out.println("Enviando mensagem");
        System.out.println(mensagem);
    }
}
