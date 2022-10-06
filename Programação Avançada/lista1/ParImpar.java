package lista1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        int v1 = 0, v2 = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe os dados do primeiro jogador: ");
        String nome1 = scan.next();
        String parImpar1 = scan.next();
        String numero1 = scan.next();
        System.out.println("Informe os dados do segundo jogador: ");
        String nome2 = scan.next();
        String parImpar2 = scan.next();
        String numero2 = scan.next();

        int numeroTotal = Integer.parseInt(numero1) + Integer.parseInt(numero2);

        if ( ((numeroTotal % 2 == 0 ) && parImpar1.equals("PAR") ) )  System.out.println(nome1.toUpperCase());
        else if ( ( numeroTotal % 2 != 0 && parImpar1.equals("ÍMPAR") ) )  System.out.println(nome1.toUpperCase());
        else System.out.println(nome2.toUpperCase());
    }
}
