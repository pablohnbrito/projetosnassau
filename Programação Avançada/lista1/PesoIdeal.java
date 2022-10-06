package lista1;

import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o peso da pessoa: ");
        double peso = scan.nextDouble();

        System.out.println("Informe a altura da pessoa: ");
        double altura = scan.nextDouble();
        scan.close();

        if (altura <= 1.50) {
            if (peso <= 50) System.out.println("Engorde " + (50-peso) +"kg");
            else System.out.println("Emagreça "+ (-peso + 50) +"kg");
        } else if (altura <= 1.90) {
            if (peso < 70) System.out.println("Engorde " + (70-peso) +"kg");
            else System.out.println("Emagreça " + (-70+peso) +"kg");
        } else {
            if (peso <= 50) System.out.println("Engorde " + (100-peso) +"kg");
            else System.out.println("Emagreça " + (-peso+100) +"kg");
        }
    }
}
