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
        doctor = new Doctor("D001", "Boldoo", "99112233", "Cardiologist");
        logger.info("Doctor test setup completed.");
    }

    @Test
    public void testSetSpecializationValid() {
        doctor.setSpecialization("Pediatrician");
        assertEquals("Pediatrician", doctor.getSpecialization());
        logger.info("Doctor specialization updated successfully.");
    }

    @Test
    public void testSetSpecializationInvalid() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            doctor.setSpecialization("");
        });
        logger.error("Exception caught: {}", exception.getMessage());
        assertEquals("The specialization field cannot be empty.", exception.getMessage());
    }
}
