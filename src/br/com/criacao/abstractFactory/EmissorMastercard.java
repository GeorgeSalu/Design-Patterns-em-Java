package br.com.criacao.abstractFactory;

public class EmissorMastercard implements Emissor {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando a seguinte mensagem para a mastercard : ");
        System.out.println(mensagem);
    }
}
