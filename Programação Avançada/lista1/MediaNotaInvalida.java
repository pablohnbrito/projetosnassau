package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MediaNotaInvalida {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Informe a nota 1: ");
        double n1 = scan.nextDouble();
        System.out.println("Informe a nota 2: ");
        double n2 = scan.nextDouble();

        if (!(n1 > 0 && n1 < 10) && !(n2 > 0 && n2 < 10)) System.out.println("NOTA INVÁLIDA");
        else {
            double media = (n1 + n2) / 2.0;
            System.out.println("MÉDIA = " + df.format(media));
        }
    }
}