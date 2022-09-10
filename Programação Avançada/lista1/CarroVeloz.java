package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CarroVeloz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int car = 0, carMax = 0;
        double velocity = 0, velocityMax = 0, velocityMedium = 0;

        for (int i=0; i<3; i++) {
            System.out.println("Digite o ano do carro "+ (i+1) + ": ");
            car = scan.nextInt();
            System.out.println("Digite a velocidade do carro "+ (i+1) +" (em km/h): ");
            velocity = scan.nextDouble();
            if (car >= carMax) carMax = car;
            if (velocity >= velocityMax) velocityMax = velocity;
            velocityMedium += velocity;
        }
        scan.close();
        System.out.println("Ano do carro mais novo = "+ carMax);
        System.out.println("Velocidade do mais rápido = " + df.format(velocityMax));
        System.out.println("Velocidade média dos carros = " + df.format(velocityMedium/3));
    }
}
