package lista1;

import java.util.Scanner;

public class SomaIntervalo {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int soma = 0, valor3;

            System.out.println("Informe o valor 1: ");
            int valor1 = scan.nextInt();
            System.out.println("Informe o valor 2:");
            int valor2 = scan.nextInt();
            scan.close();

            if (valor2 < valor1) {
                valor3 = valor1;
                valor1 = valor2;
                valor2 = valor3;
            }

            if (valor2 == valor1) {
                valor2 *= 2;
                System.out.println(valor1 +" " + valor2 + " ");
            } else {
                while (valor1 <= valor2) {
                    soma += valor1;
                    System.out.print(valor1 +" ");
                    valor1++;
                }
                System.out.print("Soma = " + soma);
            }
    }
}
