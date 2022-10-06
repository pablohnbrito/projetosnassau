package lista1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeituraGlicose {

    public static void main(String[] args) {
        int glicose, glicoseMedia = 0;
        List<Integer> lista = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("Informe o número da glicose: ");
            glicose = scan.nextInt();
            lista.add(glicose);
        }

        for (int i = 0; i < 4; i++) {
            if (lista.get(i) <= 110) System.out.println(lista.get(i) + " NORMAL");
            else if (lista.get(i) <= 125) System.out.println(lista.get(i) + " ALTERADA");
            else System.out.println(lista.get(i) + " MUITO ALTA");
            glicoseMedia += lista.get(i);
        }

        System.out.println("MÉDIA DAS LEITURAS = "+ glicoseMedia/4);
    }
}