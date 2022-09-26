package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AumentoCinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Digite o valor do ingresso sem aumento: ");
        float valorAntes = scan.nextFloat();
        System.out.println("Digite o valor do ingresso com aumento: ");
        float valorDepois = scan.nextFloat();
        scan.close();

        float aumentoPercentual = (valorAntes/valorDepois)*100;

        System.out.println(df.format(aumentoPercentual) + "%");
    }
}
