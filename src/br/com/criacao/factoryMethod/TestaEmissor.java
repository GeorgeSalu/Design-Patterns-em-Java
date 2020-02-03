package br.com.criacao.factoryMethod;

public class TestaEmissor {
    public static void main(String[] args) {
        EmissorCreator creator = new EmissorCreator();

        //SMS
        Emissor emissor1 = creator.create(EmissorCreator.SMS);
        emissor1.enviar("k19 = treinamentos");

        //EMAIL
        Emissor emissor2 = creator.create(EmissorCreator.EMAIL);
        emissor2.enviar("k19 - treinamentos");

        //JMS
        Emissor emissor3 = creator.create(EmissorCreator.JMS);
        emissor3.enviar("k19 - treinamentos");

    }
}
