package lista1;

import java.util.Scanner;

public class HOHOHO {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o número de de HOHOHO: ");
        int hohoho = scan.nextInt();
        scan.close();

        if (hohoho == 1) System.out.println("HO!");
        else {
            for (int i = 0; i < hohoho-1; i++) {
                System.out.print("HO ");
            }
            System.out.println("HO!");
        }
    }
}
