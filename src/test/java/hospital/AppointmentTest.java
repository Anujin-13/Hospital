package hospital;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AppointmentTest {
    private static final Logger logger = LogManager.getLogger(AppointmentTest.class);

    private Patient patient;
    private Doctor doctor;
    private Appointment appointment;

    @BeforeEach
    public void setUp() {
        patient = new Patient("P002", "Saraa", "99003344", 30);
        doctor = new Doctor("D002", "Naran", "99114455", "Doctor");
        appointment = new Appointment("A001", patient, doctor, LocalDateTime.now().plusDays(1));
        logger.info("Appointment test setup completed.");
    }

    @Test
    public void testAppointmentCreation() {
        assertEquals("A001", appointment.getId());
        assertEquals(patient, appointment.getPatient());
        assertEquals(doctor, appointment.getDoctor());
        assertNotNull(appointment.getAppointmentDateTime());
        logger.info("Appointment creation test passed.");
    }

    @Test
    public void testInvalidAppointmentId() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new Appointment("", patient, doctor, LocalDateTime.now());
        });
        logger.error("Exception caught: {}", exception.getMessage());
        assertEquals("Appointment ID cannot be null or empty", exception.getMessage());
    }
}
