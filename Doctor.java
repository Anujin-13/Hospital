import java.util.ArrayList;
import java.util.List;

public class Doctor extends User {
    private String name;
    private String department;
    private List<Appointment> appointments;

    public Doctor(String username, String password, String name, String department) {
        super(username, password);

        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Эмчийн нэр хоосон байж болохгүй.");
        }

        if (department == null || department.trim().isEmpty()) {
            throw new IllegalArgumentException("Тасгийн нэр хоосон байж болохгүй.");
        }

        this.name = name;
        this.department = department;
        this.appointments = new ArrayList<>();
    }

    @Override
    public String getRole() {
        return "Doctor";
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void addAppointment(Appointment appointment) {
        if (appointment == null) {
            throw new IllegalArgumentException("Үзлэг хоосон байж болохгүй.");
        }
        appointments.add(appointment);
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    @Override
    public String toString() {
        return "Эмч: " + name + ", Тасаг: " + department;
    }
}

