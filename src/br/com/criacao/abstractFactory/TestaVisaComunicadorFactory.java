package br.com.criacao.abstractFactory;

public class TestaVisaComunicadorFactory {
    public static void main(String[] args) {
        ComunicadorFactory comunicadorFactory = new VisaComunicadorFactory();

        String transacao = "Valor=560;Senha=123";
        Emissor emissor = comunicadorFactory.createEmissor();
        emissor.enviar(transacao);

        Receptor receptor = comunicadorFactory.createReceptor();
        String mensagem = receptor.recebe();
        System.out.println(mensagem);
    }
}