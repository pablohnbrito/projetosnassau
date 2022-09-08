package lista1;

import java.util.Scanner;

public class CrescPopulacao {
    public static void main(String[] args) {

        int anos = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o tamanho da população atual do país A: ");
        double paisA = scan.nextDouble();
        System.out.println("Informe o tamanho da população atual do país B: ");
        double paisB = scan.nextDouble();
        scan.close();

        while (paisA < paisB) {
            paisA *= 1.03;
            paisB *= 1.015;
            anos ++;
        }
        System.out.println(anos + " anos.");

    }
}
