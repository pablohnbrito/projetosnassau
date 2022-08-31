package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConsumoAutomovel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a distância total percorrida");
        double x = scan.nextDouble();
        System.out.println("Informe a quantidade de combustível consumida: ");
        double y = scan.nextDouble();
        double kml = (x/y);
        scan.close();
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println(df.format(kml));
    }
}
