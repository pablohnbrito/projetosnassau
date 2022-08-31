    package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoIR {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("CÁLCULO DO IMPOSTO DE RENDA!!");
        System.out.println("Informe a renda mensal do homem: ");
        double rh = scan.nextDouble();
        System.out.println("Informe a renda mensal da mulher: ");
        double rm = scan.nextDouble();
        scan.close();
        double v = rh + rm;
        double ir;
        if (v <= 900.00) ir = 0;
        else if (v <= 1500.00) ir = v * 0.1;
        else if (v <= 2500.00) ir = v*0.15;
        else ir = v*0.25;
        System.out.println("RENDA CONJUNTA: "+ df.format(v));
        if (v <= 900.00) System.out.println("ALÍQUOTA UTILIZADA: 0");
        else if (v <= 1500.00) System.out.println("ALÍQUOTA UTILIZADA: 10%");
        else if (v <= 2500.00) System.out.println("ALÍQUOTA UTILIZADA: 15%");
        else System.out.println("ALÍQUOTA UTILIZADA: 25%");
        System.out.println("IMPOSTO DE RENDA: "+ df.format(ir));
        System.out.println("RENDA LÍQUIDA: "+ df.format(v-ir));

    }
}