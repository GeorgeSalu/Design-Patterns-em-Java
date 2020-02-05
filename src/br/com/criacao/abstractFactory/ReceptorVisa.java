package br.com.criacao.abstractFactory;

public class ReceptorVisa implements Receptor {
    @Override
    public String recebe() {
        System.out.println("Recebendo mensagem da visa");
        String mensagem = "Mesagem da visa";
        return mensagem;
    }
}
