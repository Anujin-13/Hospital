import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DoctorTest {

    @Test
    public void testAddAppointment() {
        Doctor doctor = new Doctor("doc1", "1234", "Болд", "Зүрх судас");
        Patient patient = new Patient("user1", "pass", "Наран", 30, "99998888");
        Appointment appointment = new Appointment("2025-06-10", "Төлөвлөсөн", patient, doctor);

        doctor.addAppointment(appointment);

        assertEquals(1, doctor.getAppointments().size());
        assertEquals("Төлөвлөсөн", doctor.getAppointments().get(0).getStatus());
    }

    @Test
    public void testGetRole() {
        Doctor doctor = new Doctor("doc1", "1234", "Болд", "Зүрх судас");
        assertEquals("Doctor", doctor.getRole());
    }
}
