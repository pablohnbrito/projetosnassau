package PooProject2VA;

public class Loan extends Book{
    private int loanId;
    private int userId;
    private String loanData, devolutionData;

    public Loan(String bookName, int year, String author, Boolean onLoa, int bookId, int loanId, String loanData, String devolutionData) {
        super(bookName, year, author, onLoa, bookId);
        this.loanId = loanId;
        this.userId = userId;
        this.loanData = loanData;
        this.devolutionData = devolutionData;
    }

    public int getLoanId() {
        return loanId;
    }

    public int getUserId() {
        return userId;
    }

    public String getLoanData() {
        return loanData;
    }

    public void setLoanData(String loanData) {
        this.loanData = loanData;
    }

    public String getDevolutionData() {
        return devolutionData;
    }

    public void setDevolutionData(String devolutionData) {
        this.devolutionData = devolutionData;
    }

    @Override
    public void setOnLoan(boolean onLoan) {
        super.setOnLoan(onLoan);
        if (onLoan == false) System.out.println("O livro foi devolvido com sucesso!");
        else System.out.println("Empréstimo realizado com sucesso.");
    }
}
