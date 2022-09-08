package lista1;

import java.util.Scanner;

public class InverteNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número a ser invertido: ");
        String numero = scan.nextLine();
        scan.close();
        StringBuilder strb = new StringBuilder(numero);
        String numeroReverse = strb.reverse().toString();
        int numeroConvertido = Integer.parseInt(numeroReverse);
        System.out.println(numeroConvertido);
    }
}
