package PooProject2VA;

public class LoanOld {
    private String loanData;

    private String loanDataDevolution;
    private int loanId;
    private int bookId;
    private int userId;
    private static int sequence = 0;

    //deprecated
    public LoanOld(String loanData, String loanDataDevolution, int bookId) {
        this.loanData = loanData;
        this.loanDataDevolution = loanDataDevolution;
        this.bookId = bookId;
        this.userId = sequence++;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "loanData='" + loanData + '\'' +
                ", loanDataDevolution='" + loanDataDevolution + '\'' +
                ", loanId=" + loanId +
                ", bookId=" + bookId +
                ", userId=" + userId +
                '}';
    }

    public int getBookId() {
        return bookId;
    }

    public int getUserId() {
        return userId;
    }

    public String getLoanDataDevolution() {
        return loanDataDevolution;
    }

    public void setLoanDataDevolution(String loanDataDevolution) {
        this.loanDataDevolution = loanDataDevolution;
    }

}
