package br.com.comportamentais.iterator;

import java.util.Iterator;

public class ListaDeNomes implements Iterable<String>{
    private String[] nomes;
    private int lenght;

    public ListaDeNomes(String[] nomes) {
        this.nomes = nomes;
        this.lenght = this.nomes.length;
    }

    public Iterator<String> iterator() {
        return this.new ListaDeNomesIterator();
    }

    private class ListaDeNomesIterator implements Iterator<String> {
        private int i = 0;

        public boolean hasNext() {
            return (this.i) < ListaDeNomes.this.lenght;
        }

        public String next() {
            return ListaDeNomes.this.nomes[i++];
        }

        public void remove() {
            ListaDeNomes.this.nomes[i] = null;

            for(int j = i; (j+1) < ListaDeNomes.this.lenght;j++) {
                ListaDeNomes.this.nomes[j] = ListaDeNomes.this.nomes[j+1];
            }
            ListaDeNomes.this.lenght--;
        }
    }

}
