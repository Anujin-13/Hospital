public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("patient1", "pass123", "Наран", 28, "99001122");
        Doctor doctor = new Doctor("doctor1", "docpass", "Эмч Болд", "Зүрх судас");

        Appointment appointment = new Appointment("2025-06-10", "Төлөвлөсөн", patient, doctor);
        doctor.addAppointment(appointment);

        VisitRecord visitRecord = new VisitRecord("2025-06-10", "Цусны даралт ихсэлт", "Эмчилгээний эм", patient);
        patient.addVisitRecord(visitRecord);

        System.out.println("Өвчтөн: " + patient.getName() + ", Утас: " + patient.getPhone());
        System.out.println("Эмч: " + doctor.getName() + ", Хэлтэс: " + doctor.getDepartment());
        System.out.println("Цаг захиалгын огноо: " + appointment.getDate() + ", Төлөв: " + appointment.getStatus());

        System.out.println("Эмчилгээний түүх:");
        for (VisitRecord record : patient.getVisitRecords()) {
            System.out.println("- Огноо: " + record.getDate() + ", Онош: " + record.getDiagnosis() + ", Эмчилгээ: " + record.getTreatment());
        }
    }
}
