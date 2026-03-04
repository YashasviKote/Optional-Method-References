import java.util.Optional;

public class UserService {

    public Optional<String> findUserById(int id) {

        if (id == 1) {
            return Optional.of("Pruthvik");
        }

        return Optional.empty();
    }
}
