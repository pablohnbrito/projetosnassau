package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SalarioVendedor {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner scan = new Scanner(System.in);

            System.out.println("Digite o nome do vendedor: ");
            String nomeVendedor = scan.nextLine();
            System.out.println("Digite o salário fixo do vendedor " + nomeVendedor + ":");
            double salarioFixo = scan.nextDouble();
            System.out.println("Digite o valor total das vendas do vendedor "+nomeVendedor+":");
            double vendas = scan.nextDouble();
            scan.close();
            double salarioTotal = salarioFixo + (vendas*1.15);
            System.out.println("TOTAL = R$ "+df.format(salarioTotal));
    }
}
