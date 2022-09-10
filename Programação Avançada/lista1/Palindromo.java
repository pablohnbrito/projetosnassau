package lista1;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch;
        String palindromoReverse = "";


        System.out.println("Informe o valor: ");
        int numero = scan.nextInt();
        scan.close();

        String palindromo = Integer.toString(numero);

        for (int i = palindromo.length() - 1; i >= 0; i--) {
            ch = palindromo.charAt(i);
            palindromoReverse = palindromoReverse + ch;
        }

        if (palindromo.equals(palindromoReverse)) System.out.println("S"); else System.out.println("N");
    }
}
