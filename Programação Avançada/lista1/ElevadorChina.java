package lista1;

import java.util.Scanner;

public class ElevadorChina {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o número do andar: ");
        String andarString = scan.nextLine();
        scan.close();

        int andarInt = Integer.parseInt(andarString);

        while(true) {
            if (andarString.contains("4") || andarString.contains("13")) {
                andarInt++;
                andarString = Integer.toString(andarInt);
            }
            else {
                System.out.println(andarInt);
                break;
            }
        }

    }
}
