package MétodosJava;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Exercício Calculadora: ");
        System.out.println("Digite a valor a: ");
        int a = scan.nextInt();
        System.out.println("Digite a valor b: ");
        int b = scan.nextInt();
        Calculadora calculadora = new Calculadora(a, b);
        System.out.println("Soma: "+calculadora.soma());
        System.out.println("Subtração: "+calculadora.subtracao());
        System.out.println("Multiplicação: "+calculadora.multiplicacao());
        System.out.println("Divisão: "+calculadora.divisao());

        System.out.println("Exercício Empréstimo: ");
        System.out.println("Digite o valor do empréstimo : ");
        float value = scan.nextFloat();
        System.out.println("Digite em quantas vezes deseja pagar o valor: ");
        int month = scan.nextInt();
        Emprestimo emprestimo = new Emprestimo(value, month);
        System.out.println("O valor das parcelas será de: R$ "+emprestimo.valorParcelas());


    }
}
