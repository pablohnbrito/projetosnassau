package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Pessoas {
    public String nome;
    public int idade;

    public Pessoas(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0");

        int maiorIdade, menorIdade;
        double mediaIdade = 0;
        String nomeNovo = "";
        Pessoas[] pessoas = new Pessoas[5];

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Informe o nome da pessoa: ");
            String nome = scan.next();
            System.out.println("Informe a idade da pessoa: ");
            int idade = scan.nextInt();
            Pessoas pessoa1 = new Pessoas(nome, idade);
            pessoas[i] = pessoa1;
        }

        maiorIdade = pessoas[0].idade;
        menorIdade = pessoas[0].idade;

        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].idade > maiorIdade) maiorIdade = pessoas[i].idade;
            else if (pessoas[i].idade < menorIdade) {
                nomeNovo = pessoas[i].nome;
                menorIdade = pessoas[i].idade;
            }
            mediaIdade += pessoas[i].idade;
        }

        System.out.println("Maior idade = " + df.format(maiorIdade));
        System.out.println("Nome da pessoa mais nova = "+ nomeNovo);
        System.out.println("Média das idades = " + mediaIdade/5);
    }
}