package lista1;

import java.util.Scanner;

public class Fibonacci {
    static long fibo(int n) {
        return (n < 2) ? n : fibo(n - 1) + fibo(n - 2);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor: ");
        int fibo = scan.nextInt();
        int numNovo = 1;
        int numVelho = 0;

        if (fibo == 0) System.out.println("Não há valores para mostrar!");
        else {
            for (int i = 0; i < fibo; i++ ) {
                if (i > 45) break;
                System.out.print("(" + i + "):" + Fibonacci.fibo(i) + "\t");
            }
        }
    }
}