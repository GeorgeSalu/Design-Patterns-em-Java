package br.com.estruturais.flyweight;

public class TestaTemas {
    public static void main ( String [] args ) {
        Apresentacao a = new Apresentacao();
        a.adicionaSlide(new Slide(TemaFlyweightFactory
                .getTema(TemaFlyweightFactory.K19),
                "k11 = orientação a objetos",
                "Com este projeto voce vai obter uma base solida de conhecimento java"));

        a.adicionaSlide(new Slide(TemaFlyweightFactory
                .getTema(TemaFlyweightFactory.ASTERISCO),
                "k12 - desenvolvimento web com jsf2 e jpa",
                "depois deste treinamento, vc estara apto a desenvolver aplicações web com java"));

        a.adicionaSlide(new Slide(TemaFlyweightFactory
                .getTema(TemaFlyweightFactory.HIFEN),
                "k21 - Persistencia com jpa2 e hibernate",
                "neste curso de java abordamos jpa2 2 hibernate"));

        a.imprime();

    }
}
