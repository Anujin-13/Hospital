package hospital;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class User {
    private static final Logger logger = LogManager.getLogger(User.class);

    protected String id;
    protected String name;
    protected String phone;

    public User(String id, String name, String phone) {
        if (id == null || id.trim().isEmpty()) {
            logger.error("User creation failed: empty id");
            throw new IllegalArgumentException("ID cannot be empty.");
        }
        this.id = id;
        this.name = name;
        this.phone = phone;
        logger.info("User created: id={}, name={}", id, name);
    }

    public String getId() {
        logger.debug("getId called: {}", id);
        return id;
    }

    public void setId(String id) {
        if (id == null || id.trim().isEmpty()) {
            logger.error("setId failed: empty id");
            throw new IllegalArgumentException("ID cannot be empty.");
        }
        this.id = id;
        logger.info("User id updated: {}", id);
    }

    public String getName() {
        logger.debug("getName called: {}", name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
        logger.info("User name updated: {}", name);
    }

    public String getPhone() {
        logger.debug("getPhone called: {}", phone);
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
        logger.info("User phone updated: {}", phone);
    }
}
