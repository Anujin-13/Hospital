public class VisitRecord {
    private String date;
    private String diagnosis;
    private String treatment;
    private Patient patient;

    public VisitRecord(String date, String diagnosis, String treatment, Patient patient) {
        this.date = date;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.patient = patient;
    }

    public String getDate() {
        return date;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    public Patient getPatient() {
        return patient;
    }
}

