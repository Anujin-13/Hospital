public class Appointment {
    private String date;
    private String status;
    private Patient patient;
    private Doctor doctor;

    public Appointment(String date, String status, Patient patient, Doctor doctor) {
        this.date = date;
        this.status = status;
        this.patient = patient;
        this.doctor = doctor;
    }

    public String getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

