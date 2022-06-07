package Collections.Map;

import java.util.Comparator;
import java.util.Map;

public class Livro {
    private String nomeLivro;
    private int anoPublicacao;
    private int numPaginas;

    public Livro(String nomeLivro, int anoPublicacao, int numPaginas) {
        this.nomeLivro = nomeLivro;
        this.anoPublicacao = anoPublicacao;
        this.numPaginas = numPaginas;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nomeLivro='" + nomeLivro + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> o1, Map.Entry<String, Livro> o2) {
        return o1.getValue().getNomeLivro().compareToIgnoreCase(o2.getValue().getNomeLivro());
    }
}
