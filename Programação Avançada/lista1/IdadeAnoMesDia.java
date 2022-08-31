package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class IdadeAnoMesDia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe por favor sua idade em dias: ");
        int diasTotal = scan.nextInt();
        scan.close();
        int dias;
        int ano = diasTotal/(365);
        int anoResto = diasTotal%(365);
        if (ano<1) ano = 0;
        int mes = anoResto/30;
        if (mes<1) mes = 0;
        int mesResto = anoResto%30;
        if (mesResto<1) dias = 0;
        else dias = mesResto;
        System.out.println(ano + " ano (s) \n" + mes + " mês (es) \n" + dias + " dia (s)");
    }
}
