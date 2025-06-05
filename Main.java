public class Main {
    public static void main(String[] args) {
        Patient p1 = new Patient("Бат", 30, "88112233");
        Doctor d1 = new Doctor("Д.Энх", "Дотор");

        Appointment a1 = new Appointment(p1, d1, "2025-06-06");

        System.out.println(a1);
    }
}
