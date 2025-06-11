package hospital;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VisitRecordTest {
    private static final Logger logger = LogManager.getLogger(VisitRecordTest.class);

    private Patient patient;
    private Doctor doctor;
    private VisitRecord visitRecord;

    @BeforeEach
    public void setUp() {
        patient = new Patient("P003", "Болд", "99005566", 40);
        doctor = new Doctor("D003", "Сувдаа", "99116677", "Оношлогч");
        visitRecord = new VisitRecord("V001", patient, doctor, LocalDateTime.now().minusDays(1), "Ханиад", "Амрах");
        logger.info("VisitRecord test setup completed.");
    }

    @Test
    public void testVisitRecordCreation() {
        assertEquals("V001", visitRecord.getId());
        assertEquals(patient, visitRecord.getPatient());
        assertEquals(doctor, visitRecord.getDoctor());
        assertEquals("Ханиад", visitRecord.getDiagnosis());
        assertEquals("Амрах", visitRecord.getTreatment());
        logger.info("VisitRecord creation test passed.");
    }

    @Test
    public void testInvalidVisitRecordId() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            new VisitRecord("", patient, doctor, LocalDateTime.now(), "Халуурах", "Эмчлэх");
        });
        logger.error("Exception caught: {}", exception.getMessage());
        assertEquals("Visit ID cannot be null or empty", exception.getMessage());
    }
}
