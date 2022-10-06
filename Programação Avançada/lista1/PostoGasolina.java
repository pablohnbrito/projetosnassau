package lista1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PostoGasolina {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countAlcool = 0, countGas = 0, countDiesel = 0, numLeituras = 5;
        float qtdeAlcool = 0, qtdeGas = 0, qtdeDiesel = 0;

        List<Integer> tiposCombustivel = new ArrayList<>();tiposCombustivel.add(0);
        tiposCombustivel.add(0);
        tiposCombustivel.add(0);
        List<Float> qtdeCombustivel = new ArrayList<>();
        qtdeCombustivel.add(0f);
        qtdeCombustivel.add(0f);
        qtdeCombustivel.add(0f);

        for (int i = 0; i < numLeituras; i++) {
            System.out.println("Digite 1 para Álcool, 2 para Gasolina e 3 para Diesel: ");
            int tipoComb = scan.nextInt();
            System.out.println("Informe a quantidade do combustível: ");
            float qtde = scan.nextFloat();

            if (tipoComb == 1) {
                countAlcool++;
                qtdeAlcool += qtde;
                qtdeCombustivel.set(0, qtdeAlcool);
                tiposCombustivel.set(0, countAlcool);

            } else if (tipoComb == 2) {
                countGas++;
                qtdeGas += qtde;
                qtdeCombustivel.set(1, qtdeGas);
                tiposCombustivel.set(1, countGas);
            } else {
                countDiesel++;
                qtdeDiesel += qtde;
                qtdeCombustivel.set(2, qtdeDiesel);
                tiposCombustivel.set(2, countDiesel);
            }
        }
        scan.close();
        System.out.println("1. Álcool: " + tiposCombustivel.get(0) +" - Qtd Litros: " + qtdeCombustivel.get(0));
        System.out.println("2. Gasolina: " + tiposCombustivel.get(1) +" - Qtd Litros: " + qtdeCombustivel.get(1));
        System.out.println("3. Diesel: " + tiposCombustivel.get(2) +" - Qtd Litros: " + qtdeCombustivel.get(2));
    }
}
