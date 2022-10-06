package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00000000");
        float altura = 0.0f, peso = 0.0f;

        System.out.println("Informe o peso da pessoa: ");
        peso = scan.nextFloat();
        System.out.println("Informe a altura da pessoa: ");
        altura = scan.nextFloat();
        scan.close();

        float imc = (float) (peso / (Math.pow(altura, 2.0f)) );

        System.out.print("IMC = " + df.format(imc) + " - ");
        if (imc <= 20) System.out.println("Abaixo do peso");
        else if (imc <= 25) System.out.println("Peso normal");
        else if (imc <= 30) System.out.println("Sobrepeso");
        else if (imc <= 40) System.out.println("Obeso");
        else System.out.println("Obeso mórbido");

    }
}

