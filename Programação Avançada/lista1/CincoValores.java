package lista1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CincoValores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float[] entrada = new float[5];
        float somaImpar = 0, maiorNumPar = 0, menorNumero;
        int countMedia = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe os valores: ");
            float f = scan.nextFloat();
            entrada [i] = f;
        }
        scan.close();
        menorNumero = entrada[4];

        for (int j = 0; j < 5; j++) {
            if ((entrada[j]%2) == 0) {
                if ((entrada[j] > maiorNumPar)) {
                    maiorNumPar = entrada[j];
                    if ((entrada[j] < menorNumero)) menorNumero = entrada[j];
                }
            }
            else {
                somaImpar += entrada[j];
                countMedia++;
                if ((entrada[j] < menorNumero)) menorNumero = entrada[j];
            }
        }

        if (countMedia == 0) countMedia = 1;
        float mediaImpar = somaImpar/countMedia;
        float diference = maiorNumPar - menorNumero;
        System.out.println("Média dos ímpares = " + mediaImpar);
        System.out.println("Maior número par = " + maiorNumPar);
        System.out.println("Diferença = " + diference);
    }
}