package br.com.criacao.prototype;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class Campanha implements Prototype<Campanha> {
    private String nome;
    private Calendar vencimento;
    private Set<String> palavrasChave;

    public Campanha(String nome, Calendar vencimento, Set<String> palavrasChave) {
        this.nome = nome;
        this.vencimento = vencimento;
        this.palavrasChave = palavrasChave;
    }

    public String getNome() {
        return nome;
    }

    public Calendar getVencimento() {
        return vencimento;
    }

    public Set<String> getPalavrasChave() {
        return palavrasChave;
    }

    public Campanha clone() {
        String nome = "Copia de Campanha: "+this.nome;
        Calendar vencimento = (Calendar) this.vencimento.clone();
        Set<String> palavrasChave = new HashSet<String>(this.palavrasChave);
        Campanha campanha = new Campanha(nome, vencimento, palavrasChave);

        return campanha;
    }

    @Override
    public String toString() {
        return "Campanha{" +
               "nome='" + nome + '\'' +
               ", vencimento=" + vencimento +
               ", palavrasChave=" + palavrasChave +
               '}';
    }
}
