package Controller;
import Model.User;

public class ServiceUser {
    public String Authenticator (User edgar) {
        if (edgar.getCpf().isEmpty()) {
            return "Preencha o seu CPF";
        } else if (edgar.getName().isBlank()) {
            return "Preencha o seu nome";
        } else {
            return "Seus dados foram preenchidos corretamente, parabéns "+edgar.getName()+"!";
        }
    }

}
