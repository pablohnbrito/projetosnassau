package Collections.Lists;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }

    static class ComparatorAge implements Comparator<Gato> {
        @Override
        public int compare(Gato g1, Gato g2) {
            return Integer.compare(g1.getIdade(), g2.getIdade());
        }
    }

    static class ComparatorNameColorAge implements Comparator<Gato> {
        @Override
        public int compare(Gato g1, Gato g2) {
            int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
            if (nome != 0) return nome;
            int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
            if (cor != 0) return cor;
            return Integer.compare(g1.getIdade(), g2.getIdade());
        }
    }
}
