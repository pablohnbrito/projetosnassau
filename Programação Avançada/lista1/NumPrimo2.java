package lista1;

import java.util.Scanner;

public class NumPrimo2 {
    public static void main(String[] args) {
        int i = 2;
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o número que deseja verificar: ");
        int nPrimo = scan.nextInt();
        scan.close();

        while ( i < ((nPrimo/2)+1)) {
            int verificador = nPrimo % i;
            if (verificador == 0) {
                System.out.println("NÃO É PRIMO");
                break;
            }
            i++;
        }
        if (i >= nPrimo/2) System.out.println("É PRIMO");
    }
}
