package br.com.estruturais.composite;

public class TestaCaminho {
    public static void main(String[] args) {
        Trecho trecho1 = new TrecoAndando("Va ate o cruzamento da av. reboucas com a Av. brigadeiro faria lima", 500);
        Trecho trecho2 = new TrecoAndando("Va ate o cruzamento da av. reboucas com a Av. brigadeiro faria lima", 1500);
        Trecho trecho3 = new TrecoAndando("Va ate o cruzamento da av. reboucas com a Av. brigadeiro faria lima", 500);

        Caminho caminho1 = new Caminho();
        caminho1.adicionar(trecho1);
        caminho1.adicionar(trecho2);

        System.out.println("Caminho 1: ");
        caminho1.imprime();

        Caminho caminho2 = new Caminho();
        caminho2.adicionar(caminho1);
        caminho2.adicionar(trecho3);
        System.out.println("--------------------------------------");
        System.out.println("caminho 2");
        caminho2.imprime();
    }
}
