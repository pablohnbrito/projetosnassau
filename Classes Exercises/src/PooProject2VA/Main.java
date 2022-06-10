package PooProject2VA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String number;
        List<Book> books = new ArrayList<>();
        List<User> users = new ArrayList<>();
        List<Loan> loans = new ArrayList<>();
        int x=1, y=1, z=1;

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
                        while (true) {
                            System.out.println("Digite o nome do livro: ");
                            String bookName = scan.next();
                            System.out.println("Digite o ano de publicação do livro: ");
                            int bookYear = scan.nextInt();
                            System.out.println("Digite o autor do livro: ");
                            String bookAuthor = scan.next();
                            books.add(new Book(bookName, bookYear, bookAuthor, false, x));
                            System.out.println("Deseja adicionar mais um livro? (S ou N)");
                            String answer = scan.next();
                            if (answer.equals("n") || answer.equals("N")) {
                                x++;
                                break;
                            }
                            else x++;
                        }
                        break;
                    case "2":
                        while (true) {
                            System.out.println("Digite o nome do usuário: ");
                            String userName = scan.next();
                            System.out.println("Digite o CPF do usuário (usar somente números): ");
                            String cpf = scan.next();
                            System.out.println("Digite a data de nascimento do usuário: ");
                            String bdate = scan.next();
                            users.add(new User(userName, y, cpf, bdate));
                            System.out.println("Deseja adicionar mais um usuário? (S ou N)");
                            String answer = scan.next();
                            if (answer.equals("n") || answer.equals("N")) {
                                y++;
                                break;
                            }
                            else y++;
                        }
                        break;
                    case "3":
                        while (true) {
                            System.out.println("Digite o id do usuário: ");
                            int userLoanId = scan.nextInt();
                            if (users.get(userLoanId-1).getUserId() != userLoanId) {
                                System.out.println("O usuário não existe");
                                break;
                            }
                            System.out.println("Digite a data de locação: ");
                            String dataLoan = scan.next();
                            System.out.println("Digite a data de devolução: ");
                            String dataDev = scan.next();
                            System.out.println("Digite o id do livro: ");
                            int bookLoanId = scan.nextInt();
                            if (books.get(userLoanId-1).isOnLoan() == true) {
                                System.out.println("O livro já está emprestado");
                            } else {
                                loans.add(new Loan(books.get(bookLoanId-1).getBookName(), books.get(bookLoanId-1).getYear(), books.get(bookLoanId-1).getAuthor(), true,
                                        bookLoanId, z, dataLoan, dataDev));
                                books.get(userLoanId - 1).setOnLoan(true);
                            }
                            System.out.println("Deseja adicionar mais um livro? (S ou N)");
                            String answer = scan.next();
                            if (answer.equals("n") || answer.equals("N")) {
                                z++;
                                break;
                            }
                            else z++;
                        }                    break;
                    case "4":
                        while (true) {
                            int offLoanId, offBookId;
                            String devolutionData;
                            while (true) {
                                System.out.println("Digite o id do livro: ");
                                offBookId = scan.nextInt();
                                System.out.println("Digite a data da devolução do livro: ");
                                devolutionData = scan.next();
                                System.out.println("Digite o id do empréstimo: ");
                                offLoanId = scan.nextInt();
                                System.out.println("Você confirma a devolução do livro? (S ou N)");
                                String offLoan = scan.next();
                                if (offLoan.equals("s") || offLoan.equals("S")) break;
                            }
                            books.get(offBookId-1).setOnLoan(false);
                            loans.get(offLoanId-1).setOnLoan(false);
                            if (Integer.parseInt(devolutionData) <= Integer.parseInt(loans.get(offLoanId-1).getDevolutionData())) System.out.println("Devolução dentro do prazo");
                            else System.out.println("Livro devolvido fora do prazo.");
                            System.out.println("Deseja devolver mais um livro? (S ou N)");
                            String answer = scan.next();
                            if (answer.equals("n") || answer.equals("N")) break;
                        } break;
                    case "5":
                        System.out.println("Até mais!");
                        break;
                    default:
                        continue;

                }

                if (number.equals("5")) break;
            }
    }

}

