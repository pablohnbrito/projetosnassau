import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a frase: ");
        String frase = scan.nextLine();
        scan.close();
        int numberA = 0;
        for (int i = 0; i < frase.length(); i++) if (frase.charAt(i) == 'A' || frase.charAt(i) == 'a') numberA++;
        System.out.println("TOTAL DE A = " + numberA);
    }
}