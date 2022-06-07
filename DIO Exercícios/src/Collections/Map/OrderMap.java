package Collections.Map;

import java.util.*;

public class OrderMap {
    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatória\t--");

        Map<String, Livro> meusLivros = new HashMap<>() {{
            put("Rowling, JK", new Livro("Harry Potter e a Pedra Filosofal", 1997, 223));
            put("Leblanc, Maurice", new Livro("As Aventuras de Arsene Lupin", 1907, 600));
            put("Saramago, José", new Livro("Ensaio Sobre a Cegueira", 1995, 310));
            put("Amado, Jorge", new Livro("A Morte e a Morte de Quincas Berros D'água", 2008, 120));
        }};

        for (Map.Entry<String, Livro> livro : meusLivros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNomeLivro());


        System.out.println("--\tOrdem inserção\t--");

        Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {{
            put("Rowling, JK", new Livro("Harry Potter e a Pedra Filosofal", 1997, 223));
            put("Leblanc, Maurice", new Livro("As Aventuras de Arsene Lupin", 1907, 600));
            put("Saramago, José", new Livro("Ensaio Sobre a Cegueira", 1995, 310));
            put("Amado, Jorge", new Livro("A Morte e a Morte de Quincas Berros D'água", 2008, 120));
        }};

        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNomeLivro());


        System.out.println("--\tOrdem alfabética autores\t--");

        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);

        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNomeLivro());

        System.out.println("--\tOrdem alfabética nomes dos livros\t--");

        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros3)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNomeLivro());
    }
}
