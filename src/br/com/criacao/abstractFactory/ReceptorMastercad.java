package br.com.criacao.abstractFactory;

public class ReceptorMastercad implements Receptor {
    @Override
    public String recebe() {
        System.out.println("Recebendo mesagem da Mastercard");
        String mensagem = "Mensagem da Mastercard";
        return mensagem;
    }
}
