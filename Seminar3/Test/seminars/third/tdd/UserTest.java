package seminars.third.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {

    @Test
    void userCreate() {
        User user = new User("user1", "qwerty12", false);
        assertTrue(user.authenticate("user1", "qwerty12"));
    }
    @Test
    void userCreateFalse() {
        User user = new User("user1", "12qwerty", false);
        assertTrue(user.authenticate("user1", "12qwerty"));
    }

    @Test
    void userRepository() {
        UserRepository userRepository = new UserRepository();
        User userNA = new User("user1", "qwerty12", false);
        userRepository.addUser(userNA);
        assertFalse(userRepository.findByName(userNA.name));
    }
    @Test
    void userRepositoryNA() {
        UserRepository userRepository = new UserRepository();
        User userNA = new User("user1", "qwerty12", false);
        userNA.authenticate("user1", "qwerty12");
        userRepository.addUser(userNA);
        assertFalse(userRepository.findByName(userNA.name));
    }
}