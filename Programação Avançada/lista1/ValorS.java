package lista1;

import java.text.DecimalFormat;

public class ValorS {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.000000000000000");
        float S = 1f;
        float numerador = 3, denominador = 2;
        S += (float) 3/2;
        while (numerador <= 39) {
            numerador += 2;
            denominador *= 2;
            S += numerador/denominador;
        }
        System.out.println(df.format(S));

    }
}
