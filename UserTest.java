import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    public void testPasswordCheck() {
        User user = new User("user1", "secret");
        assertTrue(user.checkPassword("secret"));
        assertFalse(user.checkPassword("wrong"));
    }

    @Test
    public void testSetUsername() {
        User user = new User("user1", "secret");
        user.setUsername("newUser");
        assertEquals("newUser", user.getUsername());
    }
}
