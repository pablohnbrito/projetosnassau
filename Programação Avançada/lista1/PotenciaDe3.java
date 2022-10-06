package lista1;

import java.text.DecimalFormat;

public class PotenciaDe3 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0");

        double termo = 1;

        for (int i = 1; i < 21; i++) {
            System.out.print(df.format(termo) + " ");
            termo = Math.pow(3, i);
        }
    }
}
