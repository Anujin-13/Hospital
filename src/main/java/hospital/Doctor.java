package hospital;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Doctor extends User {
    private static final Logger logger = LogManager.getLogger(Doctor.class);

    private String specialization;

    public Doctor(String id, String name, String phone, String specialization) {
        super(id, name, phone);
        setSpecialization(specialization);
        logger.info("Doctor created: id={}, name={}, specialization={}", id, name, specialization);
    }

    public String getSpecialization() {
        logger.debug("getSpecialization called: {}", specialization);
        return specialization;
    }

    public void setSpecialization(String specialization) {
        if (specialization == null || specialization.trim().isEmpty()) {
            logger.error("Invalid specialization: empty");
            throw new IllegalArgumentException("The specialization field cannot be empty.");
        }
        this.specialization = specialization;
        logger.info("Doctor specialization updated: {}", specialization);
    }
}
