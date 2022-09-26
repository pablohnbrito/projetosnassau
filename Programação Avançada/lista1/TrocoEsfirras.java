package lista1;

import java.util.ArrayList;
import java.util.Scanner;

public class TrocoEsfirras {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] notas = {2,5,10,20,50,100};
        int stop = 0;

        System.out.println("Informe o valor da compra: ");
        int compra = scan.nextInt();
        System.out.println("Informe o valor pago pelo cliente: ");
        int valorPago = scan.nextInt();
        scan.close();

        if (((valorPago - compra)> 200) || ((valorPago - compra) < 4) ) System.out.println("Impossível");
        else {
            for (int i = 0; i< notas.length; i++) {
                for (int j = 0; j< notas.length; j++) {
                    int soma = (notas[i] + notas[j]);
                    if (valorPago - (compra + soma) == 0) {
                        stop++;
                        break;
                    }
                }
                if (stop != 0) break;
            }
            if (stop != 0) System.out.println("Possível");
            else System.out.println("Impossível");
        }
    }
}
