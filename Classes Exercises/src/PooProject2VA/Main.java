package PooProject2VA;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String number;
        while (true) {
            System.out.println("--\tBem-vindo a Biblioteca Teca\t--");
            System.out.println("Você deseja: ");
            System.out.println("1 - Cadastrar um livro: ");
            System.out.println("2 - Cadastrar um usuário: ");
            System.out.println("3 - Solicitar um empréstimo de um livro: ");
            System.out.println("4 - Devolver um um livro: ");
            System.out.println("5 - Sair. ");
            number = scan.next();

            switch (number) {
                case "1":
                    addBook();
                    break;
                case "2":
                    addUser();
                    break;
                case "3":
                    System.out.println("teste 3");
                    break;
                case "4":
                    System.out.println("teste 4");
                    break;
                case "5":
                    System.out.println("Até logo!!");
                    break;
                default:
                    System.out.println("Digite o valor correto");
                    break;
            }
            if (number.equals("5")) break;
        }
    }

        private static void addUser() {
            Scanner scan = new Scanner(System.in);
            while (true) {
                System.out.println("Digite o nome do usuário: ");
                String userName = scan.next();
                System.out.println("Digite o ano de publicação do livro: ");
                String cpf = scan.next();
                System.out.println("Digite o autor do livro: ");
                String bdate = scan.next();
                User newUser = new User(userName, cpf, bdate);
                System.out.println("Deseja adicionar mais um usuário? (S ou N)");
                String answer = scan.next();
                if (answer.equals("s") || answer.equals("S")) break;
            }
        }

        public static void addBook() {
            Scanner scan = new Scanner(System.in);

            while (true) {
                System.out.println("Digite o nome do livro: ");
                String bookName = scan.next();
                System.out.println("Digite o ano de publicação do livro: ");
                int bookYear = scan.nextInt();
                System.out.println("Digite o autor do livro: ");
                String bookAuthor = scan.next();
                Book newBook = new Book(bookName, bookYear, bookAuthor);
                System.out.println("Deseja adicionar mais um livro? (S ou N)");
                String answer = scan.next();
                if (answer.equals("s") || answer.equals("S")) break;
            }

        }
        public static void addLoan() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o id do usuário: ");
            int idUser = scan.nextInt();
            System.out.println("Digite a data de locação: ");
            String dataLoan = scan.next();
            System.out.println("Digite a data de devolução: ");
            String dataDev = scan.next();
            System.out.println("Digite o id do livro: ");
            int bookYear = scan.nextInt();
            Book newLoan = new Loan("");
            System.out.println("Deseja adicionar mais um livro? (S ou N)");
            String answer = scan.next();
            if (answer.equals("s") || answer.equals("S")) break;
        }
    }
