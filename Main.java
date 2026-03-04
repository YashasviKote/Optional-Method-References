import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        UserService service = new UserService();

        Optional<String> user = service.findUserById(1);

        // if value present
        user.ifPresent(name ->
                System.out.println("User found: " + name)
        );

        // default value
        String result = service.findUserById(2)
                .orElse("User not found");

        System.out.println(result);
    }
}
