package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Dosagem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0");

        System.out.println("Informe a idade da pessoa: ");
        int idade = scan.nextInt();
        System.out.println("Informe o peso da pessoa: ");
        float peso = scan.nextFloat();
        scan.close();


        if (idade >= 12 || peso >= 60) System.out.println((1000/500)*20 +" gotas");
        else if (idade >= 12 || peso < 60) System.out.println(df.format((875/500)*20) +" gotas");
        else if (peso <= 9) System.out.println((df.format((125*20)/500) +" gotas"));
        else if (peso <= 16) System.out.println(df.format((250*20)/500) + " gotas");
        else if (peso <= 24) System.out.println(df.format((375*20)/500) + " gotas");
        else if (peso <= 30) System.out.println(df.format((500*20)/500) + " gotas");
        else System.out.println(df.format((750*20)/500) + " gotas");

    }
}
