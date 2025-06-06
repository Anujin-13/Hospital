import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PatientTest {

    @Test
    public void testAddVisitRecord() {
        Patient patient = new Patient("user1", "pass", "Наран", 30, "99998888");
        VisitRecord record = new VisitRecord("2025-06-01", "Ханиад", "Эм уух", patient);

        patient.addVisitRecord(record);

        assertEquals(1, patient.getVisitRecords().size());
        assertEquals("Ханиад", patient.getVisitRecords().get(0).getDiagnosis());
    }

    @Test
    public void testGetRole() {
        Patient patient = new Patient("user1", "pass", "Наран", 30, "99998888");

        assertEquals("Patient", patient.getRole());
    }
}
