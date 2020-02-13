package br.com.estruturais.decorator;

public class EmissorDecoratorComCriptografia extends EmissorDecorator {
    public EmissorDecoratorComCriptografia(Emissor emissor) {
        super(emissor);
    }

    public void envia(String mensagem) {
        System.out.println("Enviando mensagem criptografada");
        this.getEmissor().envia(criptografa(mensagem));
    }

    private String criptografa(String mensagem) {
        String mensagemCritografia = new StringBuilder(mensagem).reverse().toString();
        return mensagemCritografia;
    }

}
