import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o número de letra N: ");
        double n = scan.nextDouble();
        scan.close();
        double a = 0;
        for (int i = 0; i < n; i++) a += (n-i)/(i+1);
        System.out.println("A = " + a);
    }
}
