package hospital;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DoctorTest {
    private static final Logger logger = LogManager.getLogger(DoctorTest.class);

    private Doctor doctor;

    @BeforeEach
    public void setUp() {
        doctor = new Doctor("D001", "Дэлгэр", "99112233", "Кардиолог");
        logger.info("Doctor test setup completed.");
    }

    @Test
    public void testSetSpecializationValid() {
        doctor.setSpecialization("Педиатр");
        assertEquals("Педиатр", doctor.getSpecialization());
        logger.info("Doctor specialization updated successfully.");
    }

    @Test
    public void testSetSpecializationInvalid() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            doctor.setSpecialization("");
        });
        logger.error("Exception caught: {}", exception.getMessage());
        assertEquals("Мэргэшлийн талбар хоосон байж болохгүй.", exception.getMessage());
    }
}
