package br.com.comportamentais.iterator;

import java.util.Iterator;

public class TestaIterator {
    public static void main(String[] args) {
        String[] nomes = new String[4];
        nomes[0] = "rafael";
        nomes[1] = "marcelo";
        nomes[2] = "jonas";
        nomes[3] = "solange";

        ListaDeNomes listaDeNomes = new ListaDeNomes(nomes);
        Iterator<String> iterator = listaDeNomes.iterator();
        iterator.hasNext();
        iterator.remove();

        while (iterator.hasNext()) {
            String nome = iterator.next();
            System.out.println(nome);
        }

        System.out.println("----------------------");
        System.out.println("testando o foreach");
        for(String nome : listaDeNomes) {
            System.out.println(nome);
        }
    }
}
