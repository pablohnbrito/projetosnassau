package TratamentoExcecoes;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CheckedExpections {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.0");
        df.setRoundingMode(RoundingMode.UP);



        int casos = input.nextInt();
        int cont = 0;
        while (cont < casos){

            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();

            // TODO: complete os espaços em branco com sua solução para o problema
            double total = ((a*2)+(b*3)+(c*5))/10;
            System.out.println(total);




            cont++;
        }


    }
}
