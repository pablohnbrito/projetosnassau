package lista1;

import java.util.Scanner;

public class Triangulos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o número de lados: ");
        String lado1 = scan.next();
        String lado2 = scan.next();
        String lado3 = scan.next();

        int a = Integer.parseInt(lado1);
        int b = Integer.parseInt(lado2);
        int c = Integer.parseInt(lado3);

        int d = 0;
        if (a >= b && a >= c) {
            if (b+c > a) d = 1;
        }
        else if (b >= a && b >= c) {
            if (c+a > b) d = 1;
        } else {
            if (b+c > a) d = 1;
        }

        if (d == 0) System.out.println("VALORES NÃO FORMAM UM TRIÂNGULO");
        else if ( (a == b) && (a == c) && (b == c) ) System.out.println("EQUILÁTERO");
        else if ( ( (a == b) && (a != c) ) || ( (a == c) && (a != b) ) ) System.out.println("ISÓSCELES");
        else System.out.println("ESCALENO");
    }
}