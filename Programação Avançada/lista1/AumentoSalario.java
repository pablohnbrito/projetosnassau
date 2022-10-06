package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AumentoSalario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Informe seu salário atual: ");
        double salarioAtual = scan.nextDouble();
        scan.close();

        if (salarioAtual <= 300.00) System.out.println(df.format(salarioAtual*1.05));
        else if (salarioAtual <= 500.00) System.out.println(df.format(salarioAtual*1.07));
        else System.out.println(df.format(salarioAtual*1.1));

        }
    }
