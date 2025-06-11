package hospital;

import java.time.LocalDateTime;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Represents a visit record for a patient with a doctor.
 */
public class VisitRecord {

    private static final Logger logger = LogManager.getLogger(VisitRecord.class);

    private String id;
    private Patient patient;
    private Doctor doctor;
    private LocalDateTime visitDateTime;
    private String diagnosis;
    private String treatment;

    public VisitRecord(String id, Patient patient, Doctor doctor, LocalDateTime visitDateTime, String diagnosis, String treatment) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("Visit ID cannot be null or empty");
        }
        if (patient == null) {
            throw new IllegalArgumentException("Patient cannot be null");
        }
        if (doctor == null) {
            throw new IllegalArgumentException("Doctor cannot be null");
        }
        if (visitDateTime == null) {
            throw new IllegalArgumentException("Visit date/time cannot be null");
        }

        this.id = id;
        this.patient = patient;
        this.doctor = doctor;
        this.visitDateTime = visitDateTime;
        this.diagnosis = diagnosis;
        this.treatment = treatment;

        logger.info("VisitRecord created: " + id);
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

    public LocalDateTime getVisitDateTime() {
        return visitDateTime;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }
}
