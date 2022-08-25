package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class OrdemCrescente {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int n1 = scan.nextInt();

        System.out.println("Digite o segundo valor: ");
        int n2 = scan.nextInt();

        System.out.println("Digite o terceiro valor: ");
        int n3 = scan.nextInt();

        if ((n1>n2) && (n1>n3)) {
            if (n2>n3) System.out.println(n3+"\n"+n2+"\n"+n1);
            else System.out.println(n2+"\n"+n3+"\n"+n1);
        } else if ((n2>n3)&& (n2>n1)) {
            if (n1>n3) System.out.println(n3+"\n"+n1+"\n"+n2);
            else System.out.println(n1+"\n"+n3+"\n"+n2);
        } else {
            if (n1>n2) System.out.println(n2+"\n"+n1+"\n"+n3);
            else System.out.println(n1+"\n"+n2+"\n"+n3);
        }
    }
}
