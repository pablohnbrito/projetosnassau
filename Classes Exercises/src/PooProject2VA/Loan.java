package PooProject2VA;

public class Loan {
    private String loanData;

    private String loanDataDevolution;
    private int loanId;
    private static int sequence = 0;
    private boolean onLoan = false;

    public Loan(String loanData, String loanDataDevolution) {
        this.loanId = sequence++;
        this.loanData = loanData;
        this.loanDataDevolution = loanDataDevolution;
    }

    public String getLoanData() {
        return loanData;
    }

    public void setLoanData(String loanData) {
        this.loanData = loanData;
    }

    public String getLoanDataDevolution() {
        return loanDataDevolution;
    }

    public void setLoanDataDevolution(String loanDataDevolution) {
        this.loanDataDevolution = loanDataDevolution;
    }

    public void setOnLoan(boolean onLoan) {
        this.onLoan = onLoan;
    }
}
