package PooProject2VA;

public class User {
    private String userName;
    private int userId;
    private String cpf;
    private String birthdate;

    public User(String userName, int userId, String cpf, String birthdate) {
        this.userName = userName;
        this.userId = userId;
        this.cpf = cpf;
        this.birthdate = birthdate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userId=" + userId +
                ", cpf='" + cpf + '\'' +
                ", birthdate='" + birthdate + '\'' +
                '}';
    }
}