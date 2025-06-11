package hospital;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PatientTest {
    private static final Logger logger = LogManager.getLogger(PatientTest.class);

    private Patient patient;

    @BeforeEach
    public void setup() {
        patient = new Patient("P001", "Бат", "99001122", 25);
        logger.info("Test setup complete");
    }

    @Test
    public void testSetAgeValid() {
        patient.setAge(30);
        assertEquals(30, patient.getAge());
        logger.info("Patient age set successfully");
    }

    @Test
    public void testSetAgeInvalid() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            patient.setAge(-5);
        });
        logger.error("Exception caught: {}", exception.getMessage());
        assertEquals("Нас сөрөг байж болохгүй.", exception.getMessage());
    }
}
