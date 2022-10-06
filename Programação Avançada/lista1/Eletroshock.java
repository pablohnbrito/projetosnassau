package lista1;

import java.util.Scanner;


public class Eletroshock {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String bairro = "";
        double renda;
        boolean validator = false;

        while (!validator) {
            System.out.println("Informe S para 'Santa Ana', I para 'Industriários' ou T para 'Tabatinga': ");
            bairro = scan.nextLine();
            bairro = bairro.toUpperCase();

            if ( !((bairro.equals("S")) || (bairro.equals("I")) || (bairro.equals("T"))) ) {
                System.out.println("BAIRRO INVÁLIDO");
                continue;
            }

            System.out.println("Informe a renda (em reais) ");
            renda = scan.nextDouble();
            System.out.println("Informe o consumo energético (em reais): ");
            double consumo = scan.nextDouble();

            switch(bairro){
                case "S":
                    if ((consumo < 0)|| (renda < 0) ) System.out.println("RENDA E CONSUMO NÃO PODEM SER NEGATIVOS");
                    else {
                        if ((50 <= renda) && (500 >= renda)) System.out.println(consumo - 50);
                        else if ((500 < renda) && (1000 >= renda)) System.out.println(consumo - 25);
                        else System.out.println("Desconto não permitido.");
                    }
                    validator = true;
                    break;
                case "I":
                    if ((consumo < 0) || (renda < 0)) System.out.println("RENDA E CONSUMO NÃO PODEM SER NEGATIVOS");
                    else {
                        if ((240 <= renda) && (1000 >= renda)) System.out.println(consumo - 240);
                        else if ((1000 < renda) && (5000 >= renda)) System.out.println(consumo - 120);
                        else System.out.println("Desconto não permitido.");
                    }
                    validator = true;
                    break;
                case "T":
                    if ((consumo < 0) || (renda < 0)) System.out.println("RENDA E CONSUMO NÃO PODEM SER NEGATIVOS");
                    else {
                        if ((5000 > renda) && (1000 <= renda)) System.out.println(consumo - 720);
                        else if ((10000 < renda) && (20000 >= renda)) System.out.println(consumo - 360);
                        else System.out.println("Desconto não permitido.");
                    }
                    validator = true;
                    break;
            }
        }
    }

}
