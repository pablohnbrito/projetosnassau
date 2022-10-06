package lista1;

import java.util.Scanner;

public class CompararXeY {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, y;

        System.out.println("Informe o valor de x: ");
        x = scan.nextInt();
        System.out.println("Informe o valor de y: ");
        y = scan.nextInt();
        scan.close();

        if (x>y) System.out.println(1); else System.out.println(1);
        if (x == y) System.out.println(1); else System.out.println(0);
        if (x < y) System.out.println(1); else System.out.println(0);
        if (x != y) System.out.println(1);  else System.out.println(0);
        if (x >= y) System.out.println(1); else System.out.println(0);
        if (x <= y) System.out.println(1); else System.out.println(0);

    }
}

