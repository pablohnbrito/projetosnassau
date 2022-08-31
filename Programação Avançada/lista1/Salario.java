package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");

        Scanner scan = new Scanner(System.in);
            System.out.println("Digite o número do funcionário: ");
            int id = scan.nextInt();
            System.out.println("Digite as horas trabalhadas: ");
            int ht = scan.nextInt();
            System.out.println("Digite o valor por hora: ");
            double vph = scan.nextDouble();
            scan.close();
            double salario = ht*vph;
            System.out.println("NÚMERO = " + id);
            System.out.println("SALÁRIO É = R$ " + df.format(salario));
    }
}
