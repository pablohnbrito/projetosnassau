package lista1;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o número que deseja ver a tabuada: ");
        int nTabuada = scan.nextInt();
        scan.close();

        for (int i = 1; i <= 10; i++) {
            System.out.println( nTabuada + " x " + i + " = " + nTabuada*i);
        }
    }
}
