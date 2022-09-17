package lista1;

import java.util.Scanner;

public class NassauPark {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a altura da pessoa (em cm): ");
        float altura = scan.nextFloat();
        System.out.println("Informe a idade da pessoa: ");
        int idade = scan.nextInt();
        scan.close();

        int count = 0;

        if (idade >= 12 && altura >= 1.5) count++;
        if (idade >= 14 && altura >= 1.4) count++;
        if (idade >= 16 && altura >= 1.7)  count++;

        System.out.println(count);

    }
}
