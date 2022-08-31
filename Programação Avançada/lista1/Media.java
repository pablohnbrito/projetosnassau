package lista1;
import java.text.DecimalFormat;
import java.util.*;

public class Media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a nota 1: ");
        double n1 = scan.nextDouble();
        System.out.println("Digite a nota 2: ");
        double n2 = scan.nextDouble();
        scan.close();
        double media = (n1+n2)/2;
        DecimalFormat df = new DecimalFormat("0.00000");
        System.out.println("A média é: "+ df.format(media));
    }
}
