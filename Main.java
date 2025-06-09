import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Өвчтөний мэдээлэл оруулна уу:");
            System.out.print("Нэр: ");
            String patientName = scanner.nextLine();
            System.out.print("Нас: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.print("Утасны дугаар: ");
            String phone = scanner.nextLine();

            Patient patient = new Patient("patient1", "pass123", patientName, age, phone);

            System.out.println("\nЭмчийн мэдээлэл оруулна уу:");
            System.out.print("Нэр: ");
            String doctorName = scanner.nextLine();
            System.out.print("Тасаг: ");
            String department = scanner.nextLine();

            Doctor doctor = new Doctor("doctor1", "docpass", doctorName, department);

            System.out.println("\nЦаг захиалга үүсгэнэ:");
            System.out.print("Огноо (жишээ: 2025-06-10): ");
            String appointmentDate = scanner.nextLine();
            System.out.print("Төлөв (Нээлттэй / Хаагдсан / Цуцлагдсан): ");
            String status = scanner.nextLine();

            Appointment appointment = new Appointment(appointmentDate, status, patient, doctor);
            doctor.addAppointment(appointment);

            System.out.println("\nЭмчилгээний түүх оруулна уу:");
            System.out.print("Огноо: ");
            String visitDate = scanner.nextLine();
            System.out.print("Онош: ");
            String diagnosis = scanner.nextLine();
            System.out.print("Эмчилгээ: ");
            String treatment = scanner.nextLine();

            VisitRecord visitRecord = new VisitRecord(visitDate, diagnosis, treatment, patient);
            patient.addVisitRecord(visitRecord);

            System.out.println("\n=== Мэдээлэл ===");
            System.out.println("Өвчтөн: " + patient.getName() + ", Утас: " + patient.getPhone());
            System.out.println("Эмч: " + doctor.getName() + ", Тасаг: " + doctor.getDepartment());
            System.out.println("Цаг захиалгын огноо: " + appointment.getDate() + ", Төлөв: " + appointment.getStatus());

            System.out.println("Эмчилгээний түүх:");
            for (VisitRecord record : patient.getVisitRecords()) {
                System.out.println("- Огноо: " + record.getDate() +
                                   ", Онош: " + record.getDiagnosis() +
                                   ", Эмчилгээ: " + record.getTreatment());
            }

        } catch (IllegalArgumentException e) {
            System.out.println(" Алдаа: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(" Тогтолцооны алдаа: " + e.getMessage());
        }

        scanner.close();
    }
}

