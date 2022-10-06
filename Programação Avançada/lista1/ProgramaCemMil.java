package lista1;

import java.util.Scanner;

public class ProgramaCemMil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor de x: ");
        int x = scan.nextInt();
        System.out.println("Informe o valor de y: ");
        int y = scan.nextInt();
        scan.close();
        while (x <= y) {
            for (int i = 0; i < 2; i++) {
                System.out.print(x + " ");
                x++;
            }
            System.out.println(x);
            x++;
        }
    }
}
