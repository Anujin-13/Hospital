import java.util.ArrayList;
import java.util.List;

public class Doctor extends User {
    private String name;
    private String department;
    private List<Appointment> appointments;

    public Doctor(String username, String password, String name, String department) {
        super(username, password);
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
        appointments.add(appointment);
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }
}
