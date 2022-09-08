package lista1;

import java.util.Scanner;

public class NumPrimo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int div = 0;

        System.out.println("Digite um valor: ");
        int numero = scan.nextInt();
        scan.close();
        if (numero <= 3) System.out.println(numero + " é primo");
        else {
            div = numero/2;
            for (int i = 2; i <= div; i++) {
                if (numero % i == 0) {
                    System.out.println(numero + " não é primo");
                    break;
                }
                else if (i >= div) System.out.println(numero + " é primo");
            }
        }
    }
}
