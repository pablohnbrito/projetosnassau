package lista1;

import java.util.Scanner;

public class HoraJogo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a hora inicial do jogo: ");
        int horaInicial = scan.nextInt();
        System.out.println("Informe a hora final do jogo: ");
        int horaFinal = scan.nextInt();
        scan.close();

        if (horaFinal <= horaInicial) horaFinal += 24;
        System.out.println("O jogo durou: " + (horaFinal - horaInicial) + " hora (s)");
    }
}
