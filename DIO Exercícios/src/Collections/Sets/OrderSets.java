package Collections.Sets;

import java.util.HashSet;
import java.util.Set;

public class OrderSets {
    public static void main(String[] args) {
            System.out.println("--\tOrdem aleatória\t--");
            Set<Series> minhaSerie = new HashSet<>(){{
                    add(new Series("serie1", "drama", 20));
                    add(new Series("serie2", "acao", 30));
                    add(new Series("serie3", "comedia", 15));
                }};
            for (Series series: minhaSerie) System.out.println(series.getNome() + " - " + series.getGenero() + " - " + series.getTempoEpisodio());

            System.out.println("--\tOrdem inserção\t--");
    }
}