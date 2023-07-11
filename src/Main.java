import service.UserService;

public class Main {
    public static void main(String[] args) {

        UserService.preCheck("user1", "Password1", "Password1");
        UserService.preCheck("user`", "Password1", "Password1");
        UserService.preCheck("user1м12345678901234567890", "Password1", "Password1");
        UserService.preCheck("user1", "Password112345678901234567890", "Password112345678901234567890");
        UserService.preCheck("user1", "Password1", "Password2");


    }
}

