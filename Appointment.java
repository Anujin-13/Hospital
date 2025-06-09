public class Appointment {
    private String date;
    private String status;
    private Patient patient;
    private Doctor doctor;

    public Appointment(String date, String status, Patient patient, Doctor doctor) {
        if (date == null || date.trim().isEmpty()) {
            throw new IllegalArgumentException("Огноо хоосон байж болохгүй.");
        }
        if (status == null || (!status.equalsIgnoreCase("Нээлттэй") &&
                               !status.equalsIgnoreCase("Хаагдсан") &&
                               !status.equalsIgnoreCase("Цуцлагдсан"))) {
            throw new IllegalArgumentException("Статус буруу байна. Зөвшөөрөгдөх утгууд: Нээлттэй, Хаагдсан, Цуцлагдсан.");
        }
        if (patient == null) {
            throw new IllegalArgumentException("Өвчтөн хоосон байж болохгүй.");
        }
        if (doctor == null) {
            throw new IllegalArgumentException("Эмч хоосон байж болохгүй.");
        }

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
        if (status == null || (!status.equalsIgnoreCase("Нээлттэй") &&
                               !status.equalsIgnoreCase("Хаагдсан") &&
                               !status.equalsIgnoreCase("Цуцлагдсан"))) {
            throw new IllegalArgumentException("Шинэ статус буруу байна. Зөвшөөрөгдөх утгууд: Нээлттэй, Хаагдсан, Цуцлагдсан.");
        }
        this.status = status;
    }

    @Override
    public String toString() {
        return "Огноо: " + date + ", Статус: " + status +
               "\n  Өвчтөн: " + patient.getName() + ", Эмч: " + doctor.getName();
    }
}
