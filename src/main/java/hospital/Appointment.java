package hospital;

import java.time.LocalDateTime;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Represents an appointment between a patient and a doctor.
 */
public class Appointment {

    private static final Logger logger = LogManager.getLogger(Appointment.class);

    private String id;
    private Patient patient;
    private Doctor doctor;
    private LocalDateTime appointmentDateTime;

    public Appointment(String id, Patient patient, Doctor doctor, LocalDateTime appointmentDateTime) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("Appointment ID cannot be null or empty");
        }
        if (patient == null) {
            throw new IllegalArgumentException("Patient cannot be null");
        }
        if (doctor == null) {
            throw new IllegalArgumentException("Doctor cannot be null");
        }
        if (appointmentDateTime == null) {
            throw new IllegalArgumentException("Appointment date/time cannot be null");
        }

        this.id = id;
        this.patient = patient;
        this.doctor = doctor;
        this.appointmentDateTime = appointmentDateTime;

        logger.info("Appointment created: " + id);
    }

    public String getId() {
        return id;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public LocalDateTime getAppointmentDateTime() {
        return appointmentDateTime;
    }

    public void setAppointmentDateTime(LocalDateTime newTime) {
        this.appointmentDateTime = newTime;
        logger.info("Appointment rescheduled: " + id + " to " + newTime);
    }
}
