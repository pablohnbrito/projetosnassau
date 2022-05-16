package Model;

public class Manager extends User{
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void autenticar(String password) {
        if (password == this.password) {
            System.out.println("Senha ok!!");
        } else {
            System.out.println("Senha incorreta");
        }
    }

    @Override
    public String cargo(String cargo) {
        return "Ele é um gestor, um: "+cargo;
    }
}//polimorfismo na classe cargo, classe modificada
