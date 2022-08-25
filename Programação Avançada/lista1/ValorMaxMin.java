package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValorMaxMin {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int n1 = scan.nextInt();

        System.out.println("Digite o segundo valor: ");
        int n2 = scan.nextInt();

        System.out.println("Digite o terceiro valor: ");
        int n3 = scan.nextInt();

        if ((n1>n2) && (n1>n3)) {
            System.out.println("MAIOR = "+n1);
            if (n2<n3) System.out.println("MENOR = "+n2);
            else System.out.println("MENOR = "+n3);
        } else if (n2>n3) {
            System.out.println("MAIOR = "+n2);
            if (n1<n3) System.out.println("MENOR = "+n1);
            else System.out.println("MENOR = "+n3);
        } else {
            System.out.println("MAIOR = "+n3);
            if (n1<n2) System.out.println("MENOR = "+n1);
            else System.out.println("MENOR = "+n2);
        }
    }
}
