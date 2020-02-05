package br.com.criacao.abstractFactory;

public interface ComunicadorFactory {
    Emissor createEmissor();
    Receptor createReceptor();
}
