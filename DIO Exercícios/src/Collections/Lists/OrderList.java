package Collections.Lists;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderList {
    public static void main(String[] args) {
        List<Gato> mycats = new ArrayList<>() {{
            add(new Gato("Frajola", 12, "preto"));
            add(new Gato("Mia", 15, "branco"));
            add(new Gato("Simba", 18, "amarelo"));
            add(new Gato("Chocotone", 21, "preto"));
        }};

        System.out.println("--\tOrdem de Inserção\t--");
        for (Gato o: mycats) {
            System.out.println(o.getIdade());
        }

        System.out.println("--\tOrdem Aleatória\t--");
        Collections.shuffle(mycats);
        System.out.println(mycats.get(0));

        System.out.println("--\tOrdem Natural\t--");
        Collections.sort(mycats);
        System.out.println(mycats);

        System.out.println("--\tOrdem Idade\t--");
        Collections.sort(mycats, new Gato.ComparatorAge());
        System.out.println(mycats);

        System.out.println("--\tOrdem Nome/Cor/Idade\t--");
        Collections.sort(mycats, new Gato.ComparatorNameColorAge());
        System.out.println(mycats);

    }
}

