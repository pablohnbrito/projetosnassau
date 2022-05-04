import Controller.ServiceUser;
import Model.User;

public class main {
    public static void main(String[] args) {
        User admin = new User();
        admin.setCpf("12345678911");
        admin.setId(1);
        admin.setName(null);

        ServiceUser sUser = new ServiceUser();
        System.out.print(sUser.Authenticator(admin));
    }
}
