package lista1;

import java.util.Scanner;

public class Pum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = 1;

        System.out.println("Informe o número de entradas: ");
        int entradas = scan.nextInt();
        scan.close();

        for (int i = 0; i < entradas; i++) {
            for (int j = 0; j < 4; j++) {
                if (numero%4 == 0) System.out.println("PUM");
                else System.out.print(numero + " ");
                numero++;
            }
        }
    }
}
