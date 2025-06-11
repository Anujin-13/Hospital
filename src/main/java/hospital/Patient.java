package hospital;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Patient extends User {
    private static final Logger logger = LogManager.getLogger(Patient.class);

    private int age;

    public Patient(String id, String name, String phone, int age) {
        super(id, name, phone);
        setAge(age);
        logger.info("Patient created: id={}, name={}", id, name);
    }

    public int getAge() {
        logger.debug("getAge called: {}", age);
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            logger.error("Invalid age: {}", age);
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        this.age = age;
        logger.info("Patient age updated: {}", age);
    }
}
