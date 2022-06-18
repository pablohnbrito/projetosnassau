package TratamentoExcecoes;

import java.util.Scanner;

public class UncheckedExceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a, b;
        Boolean stop = true;
        do {
            System.out.println("Digite um número: ");
            a = scanner.nextLine();
            System.out.println("Digite outro número: ");
            b = scanner.nextLine();

            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado é: "+resultado);
                stop = false;
            } catch (NumberFormatException e) { //ele pega o erro de formato numérico
                e.printStackTrace();
                //aparece a falha na tela mesmo com o try catch (mas não quebra nada)
                System.out.println("Entrada inválida, informe um número inteiro!!" +e.getMessage() +"\n");
                //getMessage() informa qual valor foi incorreto no processo
            } catch (ArithmeticException e) { //pega a falha de divisão por zero
                e.printStackTrace();
                System.out.println("Divisão impossível, informe um denominador diferente de zero!!" +e.getMessage()+"\n");
            } finally { //roda pegando ou não a falha
                if (stop == false) System.out.println("Até mais!!");
                else System.out.println("Tente novamente!!");
            }
        } while (stop);

        }

    private static int dividir(int a, int b) {
        return a/b;
    }
}
