package lista1;

import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o número: ");
        int x = scan.nextInt();

        if (x%2 == 0) {
            x ++;
            System.out.println(x);
            for (int i=0; i < 5; i++) {
                x += 2;
                System.out.println(x);
            }
        } else {
            for (int i=0; i < 6; i ++) {
                x += 2;
                System.out.println(x);
            }
        }
    }
}
