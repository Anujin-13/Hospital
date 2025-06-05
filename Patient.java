import java.util.ArrayList;
import java.util.List;

public class Patient extends User {
    private String name;
    private int age;
    private String phone;
    private List<VisitRecord> visitRecords;

    public Patient(String username, String password, String name, int age, String phone) {
        super(username, password);
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.visitRecords = new ArrayList<>();
    }

    @Override
    public String getRole() {
        return "Patient";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public void addVisitRecord(VisitRecord record) {
        visitRecords.add(record);
    }

    public List<VisitRecord> getVisitRecords() {
        return visitRecords;
    }
}

