package lista1;

import java.util.Scanner;

public class DivisaoCedulas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor;

        System.out.println("Informe um valor entre 0 e 1000000: ");
        valor = scan.nextInt();
        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        int div, resto;

        for (int count = 0; count < (notas.length); count++ ) {
            if ((valor / notas[count]) >= 1) {
                div = valor / notas[count];
                valor = valor -  (div*notas[count]);
                System.out.println(div + " notas de R$ " + notas[count] + ",00");

            }
        }

    }
}
